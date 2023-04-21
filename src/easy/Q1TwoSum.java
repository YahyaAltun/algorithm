package easy;

import java.util.Arrays;

//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//        Example 2:
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//
//        Example 3:
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

public class Q1TwoSum {
    public static void main(String[] args) {

        int [] nums = {2,11,15,7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int arr []=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j =i+1 ; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    arr[0] =i;
                    arr[1] =j;
                }
            }
        }
        return arr;
    }
}
