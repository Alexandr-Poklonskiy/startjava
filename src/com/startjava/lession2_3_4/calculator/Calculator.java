package com.startjava.lession2_3_4.calculator;

public class Calculator {
    private static boolean Correct;

    public static boolean isCorrect() {
        return Correct;
    }

    public static int calculate(String mathExpression) {
        int x;
        int y;
        String[] partsExpression;

        partsExpression = mathExpression.split(" ");
        x = Integer.parseInt(partsExpression[0]);
        y = Integer.parseInt(partsExpression[2]);
        if (x < 0 || y < 0) {
            System.out.println("Вы ввели отрицательное число." +
                    " Принимаются только целые положительные числа.");
            Correct = false;
            return 0;
        } else {
            Correct = true;
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
}