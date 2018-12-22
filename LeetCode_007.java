package com.tongxy.LeetCode;

public class LeetCode_007 {
//    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    public int isPalindrome(int x) {
        long result = 0;
        long y = (int)x;
        if (x < 0)
        {
            y = -y;
        }
        while (y > 0)
        {
            if ((result * 10 + y % 10) > Integer.MAX_VALUE || (result * 10 + y % 10) < Integer.MIN_VALUE)
            {
                return 0;
            }
            result = result * 10 + y % 10;
            y /= 10;
        }

        int final_ret = (int)result;
        if (x < 0 )
        {
            return  -final_ret;
        }else {
            return final_ret;
        }
    }

    public static void main(String[] args) {

        LeetCode_007 t = new LeetCode_007();
        System.out.println(t.isPalindrome(1534236469));
    }
}
