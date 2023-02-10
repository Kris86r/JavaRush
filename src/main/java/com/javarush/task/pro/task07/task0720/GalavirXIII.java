package com.javarush.task.pro.task07.task0720;

public class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public static void main(String[] args) {

    }

    public void defend(double num) {
        health -= superWeapon / num;
    }

    public int attack() {
        return superWeapon;
    }
}
