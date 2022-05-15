package com.startjava.lession2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[3];
        for(int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + " игрок, введи своё имя");
            players[i] = new Player(scan.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
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