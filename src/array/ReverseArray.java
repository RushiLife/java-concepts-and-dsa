package array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) 
    {
        // Step 1: Initialize the input array
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Step 2: Call reverseArray method and store the reversed result
        int[] result = reverseArray(arr); 
        
        // Step 3: Print the reversed array using enhanced for-loop
        System.out.print("Reversed Array: ");
        
        for (int i : result) 
        {
            System.out.print(i + " ");
        }

        // Alternative way to print array (commented for reference)
        
        System.out.println("Reversed Array: " + Arrays.toString(result));
        
    }

    //	Reverses the given array using two-pointer approach  
    
    public static int[] reverseArray(int[] array) 	
    {
    	// Step 4: Initialize two pointers
    	
        int start = 0;                    	// Points to the beginning of the array
        int end = array.length - 1;       	// Points to the end of the array
        
        
        while (start < end) 				// Step 5: Loop until both pointers meet in the middle
        {
            
            int temp = array[start];      	// Step 6: Store the element at start index temporarily
            
            array[start] = array[end];    	// Step 7: Assign element from end index to start index         
            
            array[end] = temp;				// Step 8: Assign stored value (temp) to end index
            
            start++;						// Step 9: Move start pointer forward
            
            end--;							// Step 10: Move end pointer backward
        }
        
        return array;						// Step 11: Return the reversed array
    }
}
