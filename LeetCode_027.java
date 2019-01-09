package com.tongxy.LeetCode;

import java.util.Arrays;

public class LeetCode_027 {
    public static int removeElement(int[] nums, int val)
    {
        int len = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (val != nums[i])
            {
                nums[len] = nums[i];
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,2,4,6,8,8};
        System.out.println(removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
}
