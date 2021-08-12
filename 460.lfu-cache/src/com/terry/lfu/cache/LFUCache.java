package com.terry.lfu.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache {
    int miniCount;
    int capacity;
    Map<Integer, Node> keyTable;
    Map<Integer, LinkedList<Node>> countTable;

    public LFUCache(int capacity) {
        this.miniCount = 0;
        this.capacity = capacity;
        keyTable = new HashMap<>(capacity);
        countTable = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        if (!keyTable.containsKey(key)) {
            return -1;
        }
        Node node = keyTable.get(key);
        int result = node.value;
        int count = node.count;
        countTable.get(count).remove(node);
        if (countTable.get(count).size() == 0) {
            countTable.remove(count);
            if (miniCount == count) {
                miniCount++;
            }
        }
        LinkedList<Node> list = countTable.getOrDefault(count + 1, new LinkedList<Node>());
        Node newNode = new Node(count + 1, key, result);
        list.offerFirst(newNode);
        countTable.put(count + 1, list);
        keyTable.put(key, newNode);
        return result;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (!keyTable.containsKey(key)) {
            if (keyTable.size() == capacity) {
                Node node = countTable.get(miniCount).peekLast();
                keyTable.remove(node.key);
                countTable.get(miniCount).pollLast();
                if (countTable.get(miniCount).size() == 0) {
                    countTable.remove(miniCount);
                }
            }
            LinkedList<Node> list = countTable.getOrDefault(1, new LinkedList<Node>());
            list.offerFirst(new Node(1, key, value));
            countTable.put(1, list);
            keyTable.put(key, countTable.get(1).peekFirst());
            miniCount = 1;
        } else {
            Node node = keyTable.get(key);
            int count = node.count;
            countTable.get(count).remove(node);
            if (countTable.get(count).size() == 0) {
                countTable.remove(count);
                if (miniCount == count) {
                    miniCount++;
                }
            }
            LinkedList<Node> list = countTable.getOrDefault(count + 1, new LinkedList<>());
            Node newNode = new Node(count + 1, key, value);
            list.offerFirst(newNode);
            countTable.put(count + 1, list);
            keyTable.put(key, newNode);
        }
    }
}

class Node {
    int count;
    int key;
    int value;

    Node(int count, int key, int value) {
        this.count = count;
        this.key = key;
        this.value = value;
    }
}
