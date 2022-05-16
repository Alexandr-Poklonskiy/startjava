package com.startjava.lession2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player[] players;
    private int secretNumber;
    private Scanner scan = new Scanner(System.in);
    private Random random = new Random();

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    void start() {
        for(int round = 1; round <= 3; round++) {
            System.out.println("Раунд " + round + "!");
            int[] lot = castLots();
            secretNumber = random.nextInt(100) + 1;
            System.out.println("Компьютер загадал число от 1 до 100. Отгадайте! У вас по 10 попыток.");
            for(int i = 0; i < 10; i++) {
                if(isGuess(players[lot[0]])) break;
                if(isGuess(players[lot[1]])) break;
                if(isGuess(players[lot[2]])) break;
            }
             for(Player player : players) {
                showAllNumbers(player);
                player.resetNumbers();
            }
        }
        showWinner();

    }

    /* Я реализовал рулетку таким образом, с помощью тасования Фишера-Йетса
    При каждом новом раунде генерируется массив со случайным порядком чисел от 0 до 2,
    и они принимаются массивом players в качестве индекса.*/
    private int[] castLots() {
        int[] lot = {0, 1, 2};
        for(int i = lot.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int swap = lot[index];
            lot[index] = lot[i];
            lot[i] = swap;
        }
        return lot;
    }

    private boolean isGuess(Player player) {
        player.setCountMove();
        System.out.println(player.getName() + " Твой ход!");
        player.setNumber(scan.nextInt());
        if(player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал число " + secretNumber + " с "
                    + player.getCountMove() + " попытки!");
            player.setCountWin();
            return true;
        }
        String direct = player.getNumber() > secretNumber ? "больше" : "меньше";
        System.out.printf("Данное число %s того, что загадал компьютер\n", direct);
        if(player.getCountMove() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
        }
        return false;
    }
    private void showWinner() {
        if(players[0].getCountWin() == players[1].getCountWin() && players[0].getCountWin() == players[2].getCountWin()) {
            System.out.println("Ничья!");
            return;
        }
        String winner = players[0].getName();
        if(players[1].getCountWin() > players[2].getCountWin()) {
            if(players[1].getCountWin() > players[0].getCountWin()) {
                winner = players[1].getName();
            }
        } else if(players[2].getCountWin() > players[0].getCountWin()) {
            winner = players[2].getName();
        }
        System.out.printf("Победил игрок %s!\n", winner);
    }

    private void showAllNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " ввёл числа: ");
        for(int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}