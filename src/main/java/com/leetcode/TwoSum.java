package com.leetcode;

/**
 * Created by xwz on 2018/6/12.
 */
public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        //method1: O(n^2), 遍历数组中的元素，再遍历剩下的元素若存在与其相加和为target的数，则返回
        int size = nums.length;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] resource = new int[]{2,3,4,6};
        int[] result = twoSum(resource, 5);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }


}
