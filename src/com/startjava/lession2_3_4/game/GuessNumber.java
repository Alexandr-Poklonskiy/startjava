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
        System.out.println("Компьютер загадал число от 1 до 100. Отгадайте! У вас по 10 попыток.");
        for(int i = 0; i < 10; i++) {
            if(isGuess(player1)) break;
            if(isGuess(player2)) break;
        }

        showAllNumbers(player1);
        showAllNumbers(player2);
        player1.resetNumbers();
        player2.resetNumbers();
    }

    private boolean isGuess(Player player) {
        player.setCount();
        System.out.println(player.getName() + " Твой ход!");
        player.setNumber(scan.nextInt());
        if(player.getNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if(player.getNumber() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " угадал число " + secretNumber + " с " + player.getCount() + " попытки!");
            return true;
        }
        if(player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
        }
        return false;
    }

    private void showAllNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " ввёл числа: ");
        for(int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}