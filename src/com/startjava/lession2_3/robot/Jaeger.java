package com.startjava.lession2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int speed;
    private int energy;

    public Jaeger(String modelName, String mark, float height, float weight, int strength,
            int armor, int speed, int energy) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.speed = speed;
        this.energy = energy;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    void showName() {
        System.out.println("Name: " + modelName + " " + mark);
    }

    void move() {
        System.out.println("Moving");
    }

    void scanKaiju() {
        System.out.println("Scanning");
    }

    void attack() {
        System.out.println("Attack");
    }

    void takeDamage() {
        armor -= 1;
        System.out.println("Under attack!");
    }

    void activShield() {
        armor += 3;
        energy -= 10;
        System.out.println("Shield activated");
    }

    void boost() {
        speed += 3;
        strength += 4;
        energy -= 20;
        System.out.println("Boost");
    }

    public void showStat() {
        System.out.println("Armor: " + armor + "\nEnergy: " + energy +
                "\nSpeed: " + speed + "\nStrength: " + strength);
    }
}