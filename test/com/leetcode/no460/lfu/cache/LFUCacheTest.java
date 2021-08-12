package com.leetcode.no460.lfu.cache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LFUCacheTest {

    @Test
    public void LFUCache01() {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        assertEquals(1, lfuCache.get(1));
        lfuCache.put(3, 3);
        assertEquals(-1, lfuCache.get(2));
        assertEquals(3, lfuCache.get(3));
        lfuCache.put(4, 4);
        assertEquals(-1, lfuCache.get(1));
        assertEquals(3, lfuCache.get(3));
        assertEquals(4, lfuCache.get(4));
    }
}