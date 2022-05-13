package com.startjava.lession2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) throws IllegalArgumentException {
        String[] partsExpression = mathExpression.split(" ");
        int x = Integer.parseInt(partsExpression[0]);
        int y = Integer.parseInt(partsExpression[2]);
        if(x < 0 || y < 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное число." +
                    " Принимаются только целые положительные числа.");
        }
        char sign = partsExpression[1].charAt(0);
        return switch(sign) {
            case '+' -> Math.addExact(x, y);
            case '-' -> Math.subtractExact(x, y);
            case '*' -> Math.multiplyExact(x, y);
            case '/' -> Math.floorDiv(x, y);
            case '%' -> x % y;
            case '^' -> (int) Math.pow(x, y);
            default -> 0;
        };
    }
}