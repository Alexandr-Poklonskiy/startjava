package com.startjava.lession2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int [] copyNumbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public void setNumbers(int number, int i) {
        numbers[i] = number;
    }

    public void resetNumbers(int index) {
        Arrays.fill(numbers, 0, index + 1, 0);
    }

    public void win(int secretNumber, int index) {
        System.out.println(name + "угадал число " + secretNumber + " с " + (index + 1) + " попытки!");
    }

    public void inNumbers(int index) {
        copyNumbers = Arrays.copyOf(numbers, index + 1);
    }

    public  void showResult() {
        System.out.println("Игрок " + name + " ввёл числа " + Arrays.toString(copyNumbers));
    }
}