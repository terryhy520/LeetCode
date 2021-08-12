package com.terry.no19.remove.nth.node.from.end.of.list;

/*
 * Copyright (c) 2019.  Terry All rights Reserved.
 */


import com.terry.listutils.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveNthNodeTest {

    @Test
    public void removeNthFromEnd01() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode result = removeNthNode.removeNthFromEnd(listNode1, 1);
        assertArrayEquals(new int[]{1,2,3,4}, RemoveNthNode.displayNListNode(result, 4));
    }

    @Test
    public void removeNthFromEnd02() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode result = removeNthNode.removeNthFromEnd(listNode1, 2);
        assertArrayEquals(new int[]{1,2,3,5}, RemoveNthNode.displayNListNode(result, 4));
    }

    @Test
    public void removeNthFromEnd03() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode result = removeNthNode.removeNthFromEnd(listNode1, 5);
        assertArrayEquals(new int[]{2,3,4,5}, RemoveNthNode.displayNListNode(result, 4));
    }

    @Test
    public void removeNthFromEnd04() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode result = removeNthNode.removeNthFromEnd(listNode1, 4);
        assertArrayEquals(new int[]{1,3,4,5}, RemoveNthNode.displayNListNode(result, 4));
    }
}