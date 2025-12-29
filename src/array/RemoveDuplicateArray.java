package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {

    public static void main(String[] args) 
    {
        // Step 1: Declare and initialize the input array
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // Step 2: Call the method to remove duplicates
        int[] result = removeDuplicates(arr);

        /* Step 3: Print the result array
         
        System.out.print("Array after removing duplicates: ");
        for (int i : result) 
        {
            System.out.print(i + " ");
        }
        
        */
        
        // Alternative way to print array (commented for reference)
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) 
    {
        // Step 4: Create a LinkedHashSet
        // - It does NOT allow duplicate elements
        // - It MAINTAINS insertion order
        Set<Integer> set = new LinkedHashSet<>();

        // Step 5: Add all elements from array to the set
        // Duplicate elements will be automatically ignored
        for (int num : array) 
        {
            set.add(num);
        }

        // Example:
        // Input array: 1 2 3 2 4 1 5
        // Set content: 1 2 3 4 5

        // Step 6: Create a new array to store unique elements
        int[] result = new int[set.size()];

        int index = 0;

        // Step 7: Copy elements from set back to array
        for (int num : set) 
        {
            result[index++] = num;
        }

        // Step 8: Return the result array
        return result;
    }
}
