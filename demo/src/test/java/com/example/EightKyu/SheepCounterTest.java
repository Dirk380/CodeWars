package com.example.EightKyu;


import com.example.EightKyu.Arrays.SheepCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SheepCounterTest {

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        @Test
        public void test() {
            assertEquals("There are 17 sheeps in total", 17, new SheepCounter().countSheeps(array1));
        }
    }
