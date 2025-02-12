// This program demonstrates how to use a for-each loop in Java to iterate over an array of integers.
public class foreachexample {
    public static void main(String[] args) {
        // We create an array of integers called 'numbers' with five elements.
        int[] numbers = {10, 20, 30, 40, 50};
        
        // The for-each loop goes through each element in the 'numbers' array.
        for (int number : numbers) {
            // For each 'number' in the array, we print it to the console.
            System.out.println(number);
        }
    }
}

// The output of this program will be:
// 10
// 20
// 30
// 40
// 50
// This shows each number in the array printed on a new line.