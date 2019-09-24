/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.terry.removenthnode;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        if (q == null) {
            // n为链表长度
            head = head.next;
            return head;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;
        return head;
    }
}
