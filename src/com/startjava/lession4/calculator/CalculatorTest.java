package com.startjava.lession4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String[] simbols = scan.nextLine().split(" ");
            calc.setX(Integer.parseInt(simbols[0]));
            calc.setY(Integer.parseInt(simbols[2]));
            calc.setSign(simbols[1].charAt(0));
            System.out.println("Ответ: " + calc.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!(answer.equals("no")) & !(answer.equals("yes")));
        } while(answer.equals("yes"));
    }
}
