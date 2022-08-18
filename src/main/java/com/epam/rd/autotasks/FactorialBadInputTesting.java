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
    }

    @Test
    void testNegativeInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("-1000"));
    }

    @Test
    void testFractionalInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("10.5"));
    }

    @Test
    void testNonDigitalInput(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> factorial.factorial("five"));
    }

}
