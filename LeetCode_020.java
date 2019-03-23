package com.tongxy.LeetCode;

public class LeetCode_020
{
    public static void main(String[] args)
    {
        System.out.println(isValid("[]{}()"));
    }

    public static boolean isValid(String str)
    {
        while (str.contains("()") || str.contains("[]") || str.contains("{}"))
        {
            str = str.replace("()", "");
            str = str.replace("[]", "");
            str = str.replace("{}", "");
        }

        return str.equals("");
    }
}
