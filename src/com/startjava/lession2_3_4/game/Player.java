package com.startjava.lession2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int countMove = 0;
    private int countWin = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countMove);
    }

    public int getNumber() {
        return numbers[countMove - 1];
    }

    public void setNumber(int number) {
        if(number > 0 && number <= 100) {
            numbers[countMove - 1] = number;
        }
    }

    public int getCountMove() {
        return countMove;
    }

    public void setCountMove() {
        countMove++;
    }

    public int getCountWin() {
        return countWin;
    }

    public void setCountWin() {
        countWin++;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countMove, 0);
        countMove = 0;
    }
}