package com.startjava.lession2_3_4.calculator;

public class Calculator {
    private int x;
    private int y;
    private char sign;

    public int calculate(String mathExppression) {
        String[] simbols = mathExppression.split(" ");
        x = Integer.parseInt(simbols[0]);
        y = Integer.parseInt(simbols[2]);
        sign = simbols[1].charAt(0);
        switch (sign) {
            case '+' :
                return Math.addExact(x, y);
            case '-' :
                return Math.subtractExact(x, y);
            case '*' :
                return Math.multiplyExact(x, y);
            case '/' :
                return Math.floorDiv(x, y);
            case '%' :
                return (int) Math.IEEEremainder(x, y);
            case '^' :
                return (int) Math.pow(x, y);
            default :
                return 0;
        }
    }
}