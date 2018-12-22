package com.tongxy.LeetCode;

// 无重复字符的最长子串
public class LeetCode_003 {

    // 滑动窗口
    private static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder("");
        int max = 0;

        for (int i=0; i<s.length(); i++)
        {
            while (sb.toString().contains(String.valueOf(s.charAt(i))))
            {
                sb.deleteCharAt(0);
            }
            sb.append(s.charAt(i));

            if (sb.length() > max) max = sb.length();
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(LeetCode_003.lengthOfLongestSubstring(s));
    }
}
