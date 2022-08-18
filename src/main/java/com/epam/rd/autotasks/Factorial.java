package com.epam.rd.autotasks;

public class Factorial {
    int integer;
    public String factorial(String n) {
        getInt(n);
        int result = getFactorial();

        return String.format("%d", result);
    }

    public void getInt(String n) {
        try {
            integer = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("A value must be an integer.");
        }
        if (integer < 0) {
            throw new IllegalArgumentException("A value must be greater than 0.");
        }
    }

    public int getFactorial() {
        int result = 1;

        for (int factor = 2; factor <= integer; factor++) {
            result *= factor;
        }

        return result;
    }
}

