package com.example;

import com.example.EightKyu.Strings.GenderReveal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderRevealTest {

    @Test
    void shouldPrintSon() {
        assertEquals("Congratulations! You're going to have a son." , GenderReveal.Reveal("XY"));
    }
    @Test
    void shouldPrintGirl(){
        assertEquals("Congratulations! You're going to have a daughter." , GenderReveal.Reveal("XX"));
    }

    @Test
    void shouldPrintWrong(){
        assertEquals("There is something wrong", GenderReveal.Reveal("XYS"));
    }

}