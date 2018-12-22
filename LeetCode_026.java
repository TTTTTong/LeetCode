package com.tongxy.LeetCode;

import java.util.Arrays;

public class LeetCode_026 {
//    给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//    不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int flag = 0;
        for (int i = 1; i < nums.length; i ++)
        {
            if (nums[flag] != nums[i])
            {
                flag ++;
                nums[flag] = nums[i];
            }
        }
        return flag + 1;
    }

    public static void main(String[] args) {
        LeetCode_026 t = new LeetCode_026();
        int[] input = new int[] {0,0,1,1,1,2,2,3,3,4};
        t.removeDuplicates(input);
        System.out.println(Arrays.toString(input));
    }
}
