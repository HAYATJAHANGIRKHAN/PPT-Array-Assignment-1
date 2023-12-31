
// **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//        **Example 1:**
//        Input: nums = [1,2,3,1]
//
//        Output: true

import java.util.Arrays;

public class boolean_contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check if any adjacent elements are equal
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,1};
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println(hasDuplicates);
    }
}

