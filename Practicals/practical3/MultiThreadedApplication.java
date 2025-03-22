// This program creates a multi-threaded application that does the following:
//
// 1. First Thread (RandomNumberGenerator):
//    - Generates a random number between 1-100 every second
//    - Passes this number to a NumberProcessor
//
// 2. Second Thread (SquareCalculator): 
//    - Activates when an even number is generated
//    - Calculates and prints the square of that number
//
// 3. Third Thread (CubeCalculator):
//    - Activates when an odd number is generated  
//    - Calculates and prints the cube of that number

import java.util.Random;

// This class generates random numbers continuously
class RandomNumberGenerator extends Thread {
    private final NumberProcessor numberProcessor;
    public RandomNumberGenerator(NumberProcessor numberProcessor) {
        this.numberProcessor = numberProcessor;
    }
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                // Generate a random integer between 1 and 100
                int number = random.nextInt(100) + 1;
                System.out.println("Generated number: " + number);
                numberProcessor.processNumber(number);
                Thread.sleep(1000);  // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// This class decides whether to calculate square or cube
class NumberProcessor {
    private Thread squareThread;
    private Thread cubeThread;

    public NumberProcessor() {
        this.squareThread = null;
        this.cubeThread = null;
    }

    public void processNumber(int number) {
        if (number % 2 == 0) {  // If number is even
            squareThread = new Thread(new SquareCalculator(number));
            squareThread.start();
        } else {  // If number is odd
            cubeThread = new Thread(new CubeCalculator(number));
            cubeThread.start();
        }
    }
}

// This class handles calculating squares of even numbers
class SquareCalculator implements Runnable {
    private final int number;
    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int result = number * number;
        System.out.println("Square of " + number + " is: " + result);
    }
}

// This class handles calculating cubes of odd numbers
class CubeCalculator implements Runnable {
    private final int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int result = number * number * number;
        System.out.println("Cube of " + number + " is: " + result);
    }
}

// Main class that starts the whole process
public class MultiThreadedApplication {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessor();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(numberProcessor);
        randomNumberGenerator.start();  // Start generating random numbers
    }
}
