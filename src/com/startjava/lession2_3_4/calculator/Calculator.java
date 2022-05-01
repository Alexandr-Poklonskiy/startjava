package com.startjava.lession2_3_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] simbolsMathExp = mathExpression.split(" ");
        int x = Integer.parseInt(simbolsMathExp[0]);
        int y = Integer.parseInt(simbolsMathExp[2]);
        char sign = simbolsMathExp[1].charAt(0);
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
                return x % y;
            case '^' :
                return (int) Math.pow(x, y);
            default :
                return 0;
        }
    }
}