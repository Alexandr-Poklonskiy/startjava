package com.startjava.lession2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    public static int calculate() {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String[] simbolsMathExp;
        do {
            System.out.print("Введите математическое выражение: ");
            simbolsMathExp = scan.nextLine().split(" ");
            x = Integer.parseInt(simbolsMathExp[0]);
            y = Integer.parseInt(simbolsMathExp[2]);
            if (x < 0 || y < 0) {
                System.out.println("Принимаются целые положительные числа");
            }
        } while (x < 0 || y < 0 );
        char sign = simbolsMathExp[1].charAt(0);
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