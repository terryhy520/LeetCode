/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */

package com.leetcode.no19.remove.nth.node.from.end.of.list;


import com.leetcode.listutils.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 *
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since 2019/10/18
 * @author Terry Hwang
 */
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

    public static int [] displayNListNode(ListNode head, int n) {
        ListNode q = head;
        int [] result = new int[n];
        int i = 0;
        while (q != null) {
            result[i++] = q.val;
            q = q.next;
        }
        return result;
    }
}
