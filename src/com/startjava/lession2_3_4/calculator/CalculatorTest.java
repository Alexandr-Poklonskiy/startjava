package com.startjava.lession2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            System.out.println("Ответ: " + calc.calculate(scan.nextLine()));
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!(answer.equals("no")) && !(answer.equals("yes")));
        } while(answer.equals("yes"));
    }
}
