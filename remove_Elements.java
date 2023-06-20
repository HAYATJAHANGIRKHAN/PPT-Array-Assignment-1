// **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//        - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//        - Return k.
//
//        **Example :**
//        Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_*,_*]
//
//        **Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[


import java.util.Arrays;

public class remove_Elements {
    public static int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int start=0;
        while(start<=end){
            if(nums[end]==val){
                end--;
            }
            else{
                if(nums[start]==val){
                    int temp=nums[end];
                    nums[end]=nums[start];
                    nums[start]=temp;
                    start++;
                    end--;
                }
                else{
                    start++;
                }
            }
        }

       return end+1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = removeElement(nums, val);
        System.out.println("Output: " + result + ", nums = " + Arrays.toString(nums));

    }
}
