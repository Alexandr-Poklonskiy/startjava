package com.startjava.lession2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getNumber() {
        return numbers[count - 1];
    }

    public void setNumber(int number) {
        numbers[count - 1] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        count++;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}