package com.startjava.lession2_3.animal;

public class Wolf {

    private String name;
    private String sex;
    private String color;
    private byte age;
    private float weight;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age > 8) {
            System.out.println("Некорректный возраст.");
        } else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void jump() {
        System.out.println("Прыгает.");
    }

    public void run() {
        System.out.println("Бежит.");
    }

    public void eat() {
        System.out.println("Ест.");
    }

    public void bite() {
        System.out.println("Кусает за бочок.");
    }

    public void missed() {
        System.out.println(name + " промахнулся.");
    }
    
    public void say() {
        System.out.println("Мы с тобой одной крови!");
    }
}