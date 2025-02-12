// This program prints all even numbers from 1 to 10.
public class even {
    public static void main(String[] args) {
        // We use a for loop to go through numbers from 1 to 10.
        for (int num = 1; num <= 10; num++) {
            // We check if the number is even by using the modulus operator (%).
            // If num % 2 equals 0, it means the number is even.
            if (num % 2 == 0) {
                // If the number is even, we print it to the console.
                System.out.println(num);
            }
        }
    }
}

// The output of this program will be:
// 2
// 4
// 6
// 8
// 10
// This shows all the even numbers between 1 and 10 printed on separate lines.
