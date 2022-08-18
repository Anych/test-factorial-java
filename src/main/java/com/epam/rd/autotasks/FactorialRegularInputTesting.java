package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testBigInt(){
        assertEquals("3628800", factorial.factorial("10"));
        assertEquals("479001600", factorial.factorial("12"));
        assertEquals("6227020800", factorial.factorial("13"));
    }
}
