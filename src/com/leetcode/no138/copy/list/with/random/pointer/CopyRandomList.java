package com.leetcode.no138.copy.list.with.random.pointer;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class CopyRandomList {

    public void printRandomList(Node head) {
        if (head == null) return;
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + "@" + System.identityHashCode(cur) + "@"
                    + System.identityHashCode(cur.random) + "-->");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node CopyRandomPointerList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        Node dummy = new Node(0);
        Node moving = dummy;
        while (head != null) {
            moving.next = map.get(head);
            moving.next.random = map.get(head.random);
            moving = moving.next;
            head = head.next;
        }
        return dummy.next;
    }
}
