package com.startjava.lession2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int turn = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, turn);
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public void setNumber(int number, int i) {
        numbers[i] = number;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn += turn;
    }

    public void resetNumbers() {
            Arrays.fill(numbers, 0, turn, 0);
            turn = 0;
    }
}