package com.example;

import com.example.EightKyu.Strings.LetterCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void itShouldPrintTwo() {
        assertEquals(2, LetterCounter.countLetter("Hello", 'l'));
    }

    @Test
    void itShouldPrintThree(){
        assertEquals(3, LetterCounter.countLetter("HelLol", 'l'));
    }

    @Test
    void itShouldPrintNothing(){
        assertEquals(0, LetterCounter.countLetter("", 'l'));
    }
}