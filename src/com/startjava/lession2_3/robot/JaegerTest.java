package com.startjava.lession2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger atlas = new Jaeger("Atlas Destroyer", "Mark-3", 86.5f, 2.8f, 9, 10, 5, 100);
        Jaeger gipsy = new Jaeger("Gipsy Danger", "Mark-3", 79.25f, 1.98f, 8, 6, 7, 100);

        atlas.showName();
        atlas.move();
        atlas.scanKaiju();
        atlas.attack();
        gipsy.showName();
        gipsy.takeDamage();
        gipsy.activShield();
        gipsy.boost();
        gipsy.showStat();
        System.out.println("Kaiju in a fury");
        atlas.setArmor(2);
        System.out.println(atlas.getModelName() + ". Armor: " + atlas.getArmor());
    }
}