package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14;
        if (radius > 0) {
            double S = pi * radius * radius;
            System.out.println((int) S);
        }
    }
}





























