package com.lizhao.easy;

import java.util.Arrays;

public class T1twoSum {
    private static int[] twoSum(int[] nums, int target) {
    int length = nums.length;
    int i;
    int j;
    for(i=0;i<length-1;i++) {
        for(j=i+1;j<length;j++) {
            if(nums[i]+nums[j]==target) {
                return new int[] {i,j};
            }
        }
    }
    return null;
        
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums[] = {2, 5, 6, 7};
        int target = 9;
        //System.out.println(nums.length);
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
