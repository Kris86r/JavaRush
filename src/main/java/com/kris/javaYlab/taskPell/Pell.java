package com.kris.javaYlab.taskPell;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n >= 0 && n <= 30) {
                int pell = (int) (((Math.pow((1 + (sqrt(2))), n)) - (Math.pow((1 - (sqrt(2))), n))) / ((sqrt(2)) + (sqrt(2))) + 1);
                System.out.println(pell);
            }
        }
    }
}
