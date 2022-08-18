package com.epam.rd.autotasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial(null));

        assertEquals("A value must be an integer.", thrown.getMessage());
    }

    @Test
    void testNegativeInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("-1000"));

        assertEquals("A value must be greater than 0.", thrown.getMessage());
    }

    @Test
    void testFractionalInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("10.5"));

        assertEquals("A value must be an integer.", thrown.getMessage());
    }

    @Test
    void testNonDigitalInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("five"));

        assertEquals("A value must be an integer.", thrown.getMessage());
    }

}
