/*
 * Copyright (c) 2020.  Terry All rights Reserved.
 */
package com.leetcode.listutils;

public class ListTools {
    /**
     * switch linked listNode to array
     *
     * @param head the listNode pointer
     * @return the array of the listNode values
     */
    public static int[] displayListNode(ListNode head) {
        ListNode node = head;
        int nodeLength = 0;
        while (node != null) {
            nodeLength++;
            node = node.next;
        }
        return displayNListNode(head, nodeLength);
    }

    /**
     * switch linked listNode to array
     *
     * @param head the listNode pointer
     * @param n    the length of the listNode
     * @return the array of the listNode values
     */
    public static int[] displayNListNode(ListNode head, int n) {
        ListNode q = head;
        int[] result = new int[n];
        int i = 0;
        while (q != null) {
            result[i++] = q.val;
            q = q.next;
        }
        return result;
    }

    /**
     * initialize a n length listNode with the ith value i
     *
     * @param n the length of listNode to be initialized
     * @return the head node of the listNode
     */
    public static ListNode initNListNode(int n) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            ListNode listNode = new ListNode(i + 1);
            current.next = listNode;
            current = current.next;
        }
        return head;
    }
}
