package com.startjava.lession2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers(int index) {
        int[] copyNumbers = Arrays.copyOf(numbers, index + 1);
        return copyNumbers;
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public void setNumber(int number, int i) {
        numbers[i] = number;
    }

    public void resetNumbers(int index) {
        if(index < 10) {
            Arrays.fill(numbers, 0, index + 1, 0);
        } else {
            Arrays.fill(numbers,0);
        }
    }
}