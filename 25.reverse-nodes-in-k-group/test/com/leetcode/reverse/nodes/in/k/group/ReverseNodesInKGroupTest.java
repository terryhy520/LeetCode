/*
 * Copyright (c) 2020.  Terry All rights Reserved.
 */

package com.leetcode.reverse.nodes.in.k.group;

import com.leetcode.listutils.ListNode;
import com.leetcode.listutils.ListTools;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseNodesInKGroupTest {

    @Test
    public void reverseKGroup01() {
        ListNode head = ListTools.initNListNode(5);
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        ListNode resultListNode = reverseNodesInKGroup.reverseKGroup(head, 3);
        assertArrayEquals(new int[]{3,2,1,4,5}, ListTools.displayListNode(resultListNode));
    }

    @Test
    public void reverseKGroup02() {
        ListNode head = ListTools.initNListNode(5);
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        ListNode resultListNode = reverseNodesInKGroup.reverseKGroup(head, 2);
        assertArrayEquals(new int[]{2,1,4,3,5}, ListTools.displayListNode(resultListNode));
    }
}