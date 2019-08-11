package com.tongxy.LeetCode;

public class LeetCode_136
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 2, 3};
        System.out.println(singleNumber(arr));
    }

    // 交换律：a ^ b ^ c = a ^ c ^ b
    //
    // 任何数于0异或为任何数 0 ^ n = n
    //
    // 相同的数异或为0: n ^ n = 0
    public static int singleNumber(int[] nums)
    {
        int res = 0;
        for (int num : nums)
        {
            res ^= num;
            System.out.println(res);
        }

        return res;
    }
}