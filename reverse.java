// This program demonstrates how to print array elements in reverse order
public class reverse {
    public static void main(String[] args) {
        // Step 1: Create and initialize an array with 5 numbers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Step 2: Print the original array
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Step 3: Print array in reverse order
        System.out.println("\nArray in reverse order:");
        // Start from last element (index 4) and go until first element (index 0)
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        /* Output will be:
        Original array:
        10
        20 
        30
        40
        50
        
        Array in reverse order:
        50
        40
        30
        20
        10
        */
    }
}
