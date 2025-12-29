package string;

public class ReverseString {

    public static void main(String[] args) 
    {
        // Input string that needs to be reversed
        String str = "I love Automation";

        // Reversing string using loop and '+' concatenation
        String result = reverse(str);

        // Reversing string using StringBuilder (optimized approach)
        String builderResult = reverseString(str);

        // Printing original and reversed output
        System.out.println("Input: " + str);
        System.out.println("Reversed using loop: " + result);
        System.out.println("Reversed using StringBuilder: " + builderResult);
    }

    /**
     * Method 1: Reverse string using loop and '+' operator
     * This approach is simple but less efficient due to immutability of String
     */
    
    public static String reverse(String input) 
    {
        // Check for null or empty string to avoid runtime exceptions
        if (input == null || input.isEmpty()) 
        {
            System.err.println("String is empty or null");
            return input;
        }

        // Initialize empty string to store reversed characters
        String output = "";

        // Loop from last character to first character
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            // Append each character to output string
            output += input.charAt(i);
        }

        // Return reversed string
        return output;
    }

    /**
     * Method 2: Reverse string using StringBuilder
     * This is a better and optimized approach
     */
    
    public static String reverseString(String input) 
    {
        // StringBuilder is mutable and improves performance
        StringBuilder sb = new StringBuilder();

        // Traverse string from end to start
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            // Append each character to StringBuilder
            sb.append(input.charAt(i));
        }

        // Convert StringBuilder to String and return
        return sb.toString();
    }
}
