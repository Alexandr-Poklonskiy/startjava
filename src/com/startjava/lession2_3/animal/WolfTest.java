package com.startjava.lession2.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf alfa = new Wolf("Акелла");
        alfa.setSex("кабель");
        alfa.setColor("серый");
        alfa.setAge((byte) 8);
        alfa.setWeight((float) 62.8);

        System.out.println("Кличка: " + alfa.getName());
        System.out.println("Пол: " + alfa.getSex());
        System.out.println("Окрас: " + alfa.getColor());
        System.out.println("Возраст: " + alfa.getAge());
        System.out.println("Вес: " + alfa.getWeight());

        alfa.say();
        alfa.run();
        alfa.jump();
        alfa.missed();
    }
}