// This class demonstrates a simple if statement in Java
class Flow_construct {
    public static void main(String[] args) {
        // Step 1: Declare and initialize a String variable
        String language = "java";
        
        // Step 2: Compare the string using equals() method
        // equals() compares the actual content of strings
        // == compares object references which may give incorrect results
        if (language.equals("java")) {
            // Step 3: Print message if condition is true
            System.out.println("best language");
        }
        
        /* The program flow:
         * 1. We create a String variable 'language' with value "java"
         * 2. We check if language equals "java" using equals() method
         * 3. Since it matches, the code inside if block executes
         * 
         * Output will be:
         * best language
         *
         * Note: If we change language = "python", nothing would print
         * because the condition would be false
         */
    }
}