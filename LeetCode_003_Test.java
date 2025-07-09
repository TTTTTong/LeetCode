package com.tongxy.LeetCode;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * LeetCode_003 单元测试类
 * 测试无重复字符的最长子串功能
 */
public class LeetCode_003_Test {

    @Test
    public void testLengthOfLongestSubstring_EmptyString() {
        // 测试空字符串
        assertEquals(0, LeetCode_003.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLengthOfLongestSubstring_SingleCharacter() {
        // 测试单个字符
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring("a"));
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring("z"));
    }

    @Test
    public void testLengthOfLongestSubstring_AllSameCharacters() {
        // 测试所有字符相同的情况
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring("aaa"));
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring("bbbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_NoRepeatingCharacters() {
        // 测试没有重复字符的情况
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("abc"));
        assertEquals(5, LeetCode_003.lengthOfLongestSubstring("abcde"));
    }

    @Test
    public void testLengthOfLongestSubstring_RepeatingAtEnd() {
        // 测试重复字符在末尾的情况
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_RepeatingAtBeginning() {
        // 测试重复字符在开头的情况
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_ComplexCase() {
        // 测试复杂情况
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring_WithSpaces() {
        // 测试包含空格的情况
        assertEquals(4, LeetCode_003.lengthOfLongestSubstring("a b c"));
        assertEquals(5, LeetCode_003.lengthOfLongestSubstring("a b c d"));
    }

    @Test
    public void testLengthOfLongestSubstring_WithNumbers() {
        // 测试包含数字的情况
        assertEquals(4, LeetCode_003.lengthOfLongestSubstring("a1b2"));
        assertEquals(6, LeetCode_003.lengthOfLongestSubstring("a1b2c3"));
    }

    @Test
    public void testLengthOfLongestSubstring_WithSpecialCharacters() {
        // 测试包含特殊字符的情况
        assertEquals(4, LeetCode_003.lengthOfLongestSubstring("a@b#"));
        assertEquals(5, LeetCode_003.lengthOfLongestSubstring("a@b#c$"));
    }

    @Test
    public void testLengthOfLongestSubstring_LongString() {
        // 测试长字符串
        String longString = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(26, LeetCode_003.lengthOfLongestSubstring(longString));
    }

    @Test
    public void testLengthOfLongestSubstring_RepeatingPattern() {
        // 测试重复模式
        assertEquals(2, LeetCode_003.lengthOfLongestSubstring("ababab"));
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("abcabc"));
    }

    @Test
    public void testLengthOfLongestSubstring_EdgeCases() {
        // 测试边界情况
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring(" "));
        assertEquals(1, LeetCode_003.lengthOfLongestSubstring("!"));
        assertEquals(2, LeetCode_003.lengthOfLongestSubstring("!@"));
    }

    @Test
    public void testLengthOfLongestSubstring_ChineseCharacters() {
        // 测试中文字符
        assertEquals(3, LeetCode_003.lengthOfLongestSubstring("你好世界"));
        assertEquals(2, LeetCode_003.lengthOfLongestSubstring("你好你好"));
    }

    @Test
    public void testLengthOfLongestSubstring_MixedCharacters() {
        // 测试混合字符
        assertEquals(7, LeetCode_003.lengthOfLongestSubstring("a1b2c3d"));
        assertEquals(8, LeetCode_003.lengthOfLongestSubstring("a@b#c$d%"));
    }
}