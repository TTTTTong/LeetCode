package com.tongxy.LeetCode;

public class LeetCode_021
{
    public static void main(String[] args)
    {

    }

    // 遍历解法
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
//    {
//        ListNode dummyHead = new ListNode(0);
//        ListNode cur = dummyHead;
//
//        while (null != l1 && null != l2)
//        {
//            if (l1.val < l2.val)
//            {
//                cur.next = l1;
//                cur = cur.next;
//                l1 = l1.next;
//            }
//            else
//            {
//                cur.next = l2;
//                cur = cur.next;
//                l2 = l2.next;
//            }
//        }
//
//        if (null == l1)
//        {
//            cur.next = l2;
//        }
//        else
//        {
//            cur.next = l1;
//        }
//
//        return dummyHead.next;
//    }

    // 递归解法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}

