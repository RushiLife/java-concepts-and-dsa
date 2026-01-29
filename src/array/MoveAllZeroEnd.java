package array;

import java.util.Arrays;

/**
 * This class moves all zero values to the end of an array
 * while maintaining the order of non-zero elements.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1) (in-place modification)
 */
public class MoveAllZeroEnd {

    public static void main(String[] args) {

        // Input array
        int[] array = {0, 2, 3, 0, 4, 0, 2, 0};

        // Move all zeros to the end of the array
        moveAllZeroAtEnd(array);

        // Print the modified array
        System.out.println(Arrays.toString(array));
    }

    /**
     * Moves all zeros to the end of the given array.
     * This method modifies the array in-place.
     *
     * @param input the input integer array
     */
    public static void moveAllZeroAtEnd(int[] input) {

        // Index to track the position for the next non-zero element
        int index = 0;

        // Step 1: Move all non-zero elements to the front
        for (int num : input) {
            if (num != 0) {
                input[index++] = num;
            }
        }

        // Debug log (safe: does not modify index)
        System.out.println("Non-zero elements count: " + index);

        // Step 2: Fill the remaining positions with zero
        while (index < input.length) {
            input[index++] = 0;
        }
    }
}
