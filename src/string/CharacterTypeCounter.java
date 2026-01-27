package string;

import java.util.Map;
import java.util.HashMap;


public class CharacterTypeCounter {

	public static void main(String[] args) 
	{	
		// Input string
        String input = "I love Automation 143%";

        // Call utility method to get character type counts
        Map<String, Integer> output = characterTypeCounter(input);

        // Print the final result
        System.out.println(output);

	}
	
	public static Map<String,Integer> characterTypeCounter(String input)
	{
		 // HashMap is used to store character type counts
        Map<String, Integer> storedValue = new HashMap<>();

        // Validate input to avoid NullPointerException
        if (input == null || input.isEmpty()) {
            return storedValue; // return empty map instead of null (best practice)
        }

        // Initialize all keys with default value 0
        storedValue.put("Alphabets", 0);
        storedValue.put("Digits", 0);
        storedValue.put("Spaces", 0);
        storedValue.put("SpecialCharacter", 0);

        // Iterate through each character of the input string
        for (char ch : input.toCharArray()) {

            // Check if character is an alphabet
            if (Character.isAlphabetic(ch)) {
                storedValue.put("Alphabets",
                        storedValue.getOrDefault("Alphabets", 0) + 1);
            }
            // Check if character is a digit
            else if (Character.isDigit(ch)) {
                storedValue.put("Digits",
                        storedValue.getOrDefault("Digits", 0) + 1);
            }
            // Check if character is a whitespace
            else if (Character.isWhitespace(ch)) {
                storedValue.put("Spaces",
                        storedValue.getOrDefault("Spaces", 0) + 1);
            }
            // Remaining characters are considered special characters
            else {
                storedValue.put("SpecialCharacter",
                        storedValue.getOrDefault("SpecialCharacter", 0) + 1);
            }
        }

        // Return final count map
        return storedValue;
    }

    /**************************** NOTE ****************************
     
     HashMap:
     
     1. HashMap is used because the logic only requires counting
     2. Fastest Map implementation (O(1) average)
     3. HashMap provides faster performance and lower memory usage.
     
     
     LinkedHashMap:
     
     1. Slightly slower than HashMap
     2. LinkedHashMap is not used because it maintains insertion order. 
     3. Overkill when ordering is not required
     4. Uses more memory (maintains a doubly-linked list)
     
     Impact on Output:
     
     * With HashMap: {SpecialCharacter=1, Alphabets=15, Digits=3, Spaces=3}

     * With LinkedHashMap: {Alphabets=15, Digits=3, Spaces=3, SpecialCharacter=1}
     
     */

}
