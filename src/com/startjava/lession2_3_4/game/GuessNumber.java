package com.startjava.lession2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private int index;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("Компьютер загадал число от 1 до 100. Отгадайте! У вас по 10 попыток.");
        for(index = 0; index < 10;  index++) {
            System.out.println(player1.getName() + " Твой ход!");
            player1.setNumbers(scan.nextInt(), index);
            if(player1.getNumber(index) > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(player1.getNumber(index) < secretNumber) {
                 System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                player1.win(secretNumber, index);
                /* Из-за того что, если выигрывает первый игрок, у второго игрока количество введённых чисел меньше на 1,
                    метод, который записывает результаты ввода для второго игрока, я разместил в двух местах,
                    в зависимости от того кто выиграл*/
                player2.inNumbers(index - 1);
            }
            if(index == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки.");
            }


            System.out.println(player2.getName() + " Твой ход!");
            player2.setNumbers(scan.nextInt(), index);
            if(player2.getNumber(index) > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(player2.getNumber(index) < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                player2.win(secretNumber, index);
                player2.inNumbers(index);
                break;
            }
        }
        player1.inNumbers(index);
        player1.showResult();
        player2.showResult();
        player1.resetNumbers(index);
        player2.resetNumbers(index);
    }
}