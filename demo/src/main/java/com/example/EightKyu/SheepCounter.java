package com.example.EightKyu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class SheepCounter {
    static Boolean[] arrayOfSheeps = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};




    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(x -> x).toArray().length;
    }

    public static void main(String[] args) {
        countSheeps(arrayOfSheeps);
    }
}

