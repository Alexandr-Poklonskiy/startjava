package com.startjava.lession2.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp866");
        System.out.println("Первый игрок, введи своё имя");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Второй игрок, введи своё имя");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
    }
}