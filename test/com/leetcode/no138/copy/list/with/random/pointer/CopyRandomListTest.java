package com.leetcode.no138.copy.list.with.random.pointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyRandomListTest {

    @Test
    public void copyRandomList() {
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        head.random = null;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;
        CopyRandomList copy = new CopyRandomList();
        copy.printRandomList(head);
        Node result = copy.CopyRandomPointerList(head);
        copy.printRandomList(result);
    }
}