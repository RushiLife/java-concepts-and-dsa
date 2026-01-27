package string;

import java.util.HashMap;
import java.util.Map;


/**
 * This class is used to find the occurrence count
 * of each character in a given string.
 */

public class OccurrenceOfCharacter 
{
	
	public static void main(String args[]) 
	{
		 // Input string
        // Convert to lowercase to avoid case sensitivity
        // Remove spaces to count only characters
		
        String str = "I love Automation 143%".toLowerCase().replace(" ", "");

        // Call utility method to get character occurrences
        Map<Character, Integer> output = occurrenceOfCharacter(str);

        // Print the result
        System.out.println(output);
	}
	
	public static Map<Character, Integer> occurrenceOfCharacter(String input)
	{
		 
		// Create a map to store character count
        Map<Character, Integer> storedChar = new HashMap<>();

        // Validate input to avoid NullPointerException
        if (input == null || input.isEmpty()) {
            return storedChar; // return empty map instead of null (best practice)
        }

        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {

            // getOrDefault returns existing value if present,
            // otherwise returns 0
            storedChar.put(ch, storedChar.getOrDefault(ch, 0) + 1);
        }

        // Return the final map
        return storedChar;
		
	}
	

}


