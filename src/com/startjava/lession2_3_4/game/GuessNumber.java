package com.startjava.lession2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("Компьютер загадал число от 1 до 100. Отгадайте!");
        while(true) {
            System.out.println(player1.getName() + " Твой ход!");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(player1.getNumber() < secretNumber) {
                 System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println(player1.getName() + " ты великолепен! Загаданное число " + secretNumber);
                break;
            }

            System.out.println(player2.getName() + " Твой ход!");
            player2.setNumber(scan.nextInt());
            if(player2.getNumber() > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(player2.getNumber() < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println(player2.getName() + " ты великолепен! Загаданное число " + secretNumber);
                break;
            }
        }
    }
}