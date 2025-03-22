// Design a java program that Implements a multi-thread application that has three threads. first thread generates random integer every 1 second and if the value is even, second thread computes the square of the number and prints. if the value is odd, the third thread will print the value of cube of the number.
import java.util.Random;
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
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberProcessor {
    private Thread squareThread;
    private Thread cubeThread;

    public NumberProcessor() {
        this.squareThread = null;
        this.cubeThread = null;
    }

    public void processNumber(int number) {
        if (number % 2 == 0) {
            squareThread = new Thread(new SquareCalculator(number));
            squareThread.start();
        } else {
            cubeThread = new Thread(new CubeCalculator(number));
            cubeThread.start();
        }
    }
}

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
public class MultiThreadedApplication {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessor();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(numberProcessor);
        randomNumberGenerator.start();
    }
}
