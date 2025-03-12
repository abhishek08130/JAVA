public class StringOperations {
    public static void main(String[] args) {
        // Original string
        String original = "Hello World";
        
        // Length demonstration
        System.out.println("Length of string: " + original.length());
        
        // Replace demonstration
        String replaced = original.replace('l', 'L');
        System.out.println("After replacing 'l' with 'L': " + replaced);
        
        // Reverse demonstration using StringBuilder
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed string: " + reversed);
        
        // Append demonstration
        StringBuilder builder = new StringBuilder("Hello");
        builder.append("abhi");
        builder.append("Java");
        builder.append("!");
        System.out.println("After appending: " + builder.toString());
    }
}
