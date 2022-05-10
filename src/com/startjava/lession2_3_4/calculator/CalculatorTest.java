package com.startjava.lession2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Ответ: " + Calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!(answer.equals("no")) && !(answer.equals("yes")));
        } while(answer.equals("yes"));
    }
}
