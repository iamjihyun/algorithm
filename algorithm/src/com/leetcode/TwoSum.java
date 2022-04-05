package com.leetcode;


public class TwoSum {
    public TwoSum() {
    }

    public static void main(String[] args) {
        int[] arr3 = new int[5];
        String[] arr4 = new String[5];
        int[] arr = new int[5];
        int[] var10000 = new int[]{1, 2, 3, 4, 5};
        var10000 = new int[]{1, 3, 5, 2, 4};
        var10000 = new int[]{1, 3, 5, 7, 9};
        String[] var13 = new String[]{"월", "화", "수", "목", "금", "토", "일"};
        int[][] arr8 = new int[4][3];
        int[][] var14 = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 4, 5}};
        int[] result = new int[]{2, 7, 11, 15};
        result = twoSum(result, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0; i < nums.length; ++i) {
            for(int j = 0; i > j; ++j) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(i + ", " + j);
                    System.out.println(nums[i] + nums[j]);
                }
            }
        }

        return result;
    }
}
