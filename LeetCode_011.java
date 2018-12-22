package com.tongxy.LeetCode;

import java.util.Arrays;

public class LeetCode_011 {

    // 暴力解
    public static int maxArea0(int[] height)
    {
        int max = 0;

        for (int i = 0; i < height.length - 1; i++)
        {
            for (int j = i + 1; j < height.length; j++)
            {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }

        return max;
    }

    // 双指针
    public static int maxArea(int[] height)
    {
        int max = 0, l = 0, r = height.length - 1;
        while (l < r)
        {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
            {
                l++;
            }else {
                r--;
            }
        }

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println(LeetCode_011.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
