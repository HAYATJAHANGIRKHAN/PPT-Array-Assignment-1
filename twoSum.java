
//**Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//        **Example:**
//        Input: nums = [2,7,11,15], target = 9
//        Output0 [0,1]
//
//        **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][





public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
      for (int i=0;i< nums.length;i++){
          for (int j=i+1;j<nums.length;j++){
              if (nums[i]+nums[j]==target){
                  int a[]={i,j};
                  return a;
              }
          }
      }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No two elements in the array sum up to the target.");
        }

        }
    }



