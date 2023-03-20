package com.example.EightKyu;

import com.example.EightKyu.Arrays.LostWithoutMap;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class LostWithoutMapTest {

    @Test
    public void mapTest() {
        assertArrayEquals(new int[]{2,4,6}, LostWithoutMap.map(new int[]{1,2,3}));
    }
}