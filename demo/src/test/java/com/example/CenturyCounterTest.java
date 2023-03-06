package com.example;

import com.example.EightKyu.CenturyCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyCounterTest {

    @Test
    void century() {
        assertEquals(18, CenturyCounter.Century(1705));
        assertEquals(23, CenturyCounter.Century(2300));
    }
}