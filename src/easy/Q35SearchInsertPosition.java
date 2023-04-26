package easy;

//        Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.

//        Example 1:
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

//        Example 2:
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1

//        Example 3:
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4

public class Q35SearchInsertPosition {
    public static void main(String[] args) {

        int [] nums = {1,2,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int goal = 0;
        int number = 0;

        while (number < nums.length) {
            if (target==nums[number]){
                goal = number+1;
            }else if (target<nums[number]){
                goal = number;
                break;
            }else goal= nums.length;
         number ++;
        }
        return goal;
    }
}
