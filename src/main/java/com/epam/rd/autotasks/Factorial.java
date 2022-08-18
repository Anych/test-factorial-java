package com.epam.rd.autotasks;

public class Factorial {
    int integer;
    public String factorial(String n) {
        getInt(n);

        return String.format("%d", integer);
    }

    public void getInt(String n) {
        try {
            System.out.println(Integer.parseInt(n));
            integer = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("A value must be an integer.");
        }
        if (integer < 0) {
            throw new IllegalArgumentException("A value must be greater than 0.");
        }
    }
}

