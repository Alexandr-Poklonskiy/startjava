package com.startjava.lession2.calculator;

public class Calculator {
    private int x;
    private int y;
    private char sign;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+' :
                return x + y;
            case '-' :
                return x - y;
            case '*' :
                return x * y;
            case '/' :
                return x / y;
            case '%' :
                return x % y;
            case '^' :
                int result = 1;
                for(int i = 0; i < y; i++) {
                    result *= x;
                }
                return result;
            default :
                return 0;
        }
    }
}