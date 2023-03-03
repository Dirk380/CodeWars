package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanToStringTest {

    @Test
    void shouldPrintTrue() {
        assertEquals("true", BooleanToString.convert(true));

    }
    @Test
    void shouldPrintFalse(){
        assertEquals("false", BooleanToString.convert(false));
    }
}