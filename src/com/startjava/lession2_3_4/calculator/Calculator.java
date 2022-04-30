package com.startjava.lession2_3_4.calculator;

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