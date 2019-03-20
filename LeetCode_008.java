package com.tongxy.LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode_008
{
    public static void main(String[] args)
    {
        String s = " -42";
        LeetCode_008 l = new LeetCode_008();
        System.out.print(l.myAtoi(s));
    }

    public int myAtoi(String str)
    {
        String  strRe = "^(\\s+)?([-+]?\\d+)";
        Pattern pattern = Pattern.compile(strRe);
        try
        {
            Matcher m = pattern.matcher(str);
            if (m.find())  // Java中💊find一下
            {
                String result = m.group(2);
                if (Double.valueOf(result) > Integer.MAX_VALUE)
                {
                    return Integer.MAX_VALUE;
                }
                else if(Double.valueOf(result) < Integer.MIN_VALUE)
                {
                    return Integer.MIN_VALUE;
                }
                else
                {
                    return Integer.valueOf(result);
                }
            }

        }
        catch (Exception e)
        {
            return 0;
        }
        return 0;
    }
}
