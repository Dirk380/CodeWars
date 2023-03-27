package com.example.EightKyu.Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuarterOfYearTest {

    @Test
    void quaterCountTest() {
        assertEquals(2,QuarterOfYear.quaterCount(5));
    }
}