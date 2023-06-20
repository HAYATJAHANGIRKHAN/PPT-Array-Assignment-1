
//        💡 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//        You are given an integer array nums representing the data status of this set after the error.
//
//        Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//        **Example 1:**
//        Input: nums = [1,2,2,4]
//        Output: [2,3]

import java.util.Arrays;

public class FindDuplicateAndMissingNumbers {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; // Duplicate number
            } else if (count[i] == 0) {
                result[1] = i; // Missing number
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
