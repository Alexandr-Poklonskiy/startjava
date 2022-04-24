package com.startjava.lession1.game;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\".");
        int targetNumber = 24;
        int guessNumber = 50;
        int step = 25;
        while(guessNumber != targetNumber) {
            if(guessNumber < targetNumber) {
                System.out.println("Данное число "+ guessNumber + " меньше того, что загадал компьютер");
                guessNumber += step;
            } else {
                System.out.println("Данное число " + guessNumber + " больше того, что загадал компьютер");
                guessNumber -= step;
            }
            step -= step / 2;
        }
        System.out.println("Искомое число " + guessNumber + " Вы победили!");
        
    }
}