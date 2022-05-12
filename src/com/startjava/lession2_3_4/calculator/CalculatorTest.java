package com.startjava.lession2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        int result;
        do {
            do {
                System.out.print("Введите математическое выражение: ");
                result = Calculator.calculate(scan.nextLine());
            } while(!Calculator.isCorrect());
            System.out.println("Ответ: " + result);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
    }
}
