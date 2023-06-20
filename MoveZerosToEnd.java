
//        💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//        **Example 1:**
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]

import java.util.*;
public class MoveZerosToEnd {
    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int count = 0; // Keeps track of the position where non-zero elements should be placed

        // Traverse the array and move non-zero elements to the beginning
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            nums[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};


        System.out.println("Original Array: " + Arrays.toString(nums));
        moveZeros(nums);
        System.out.println("Modified Array: " + Arrays.toString(nums));

    }
}
