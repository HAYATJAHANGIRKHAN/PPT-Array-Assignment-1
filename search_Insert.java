
//**Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//        **Example 1:**
//        Input: nums = [1,3,5,6], target = 5

//        Output: 2

public class  search_Insert{

        public static int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // If the target is not found, the left pointer will be pointing to the index
            // where the target should be inserted.
            return left;
        }

        public static void main(String[] args) {
            int[] nums = {1, 3, 5, 6};
            int target = 5;
            int result = searchInsert(nums, target);
            System.out.println(result);
        }
    }


