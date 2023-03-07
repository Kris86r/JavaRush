package com.kris.javaYlab.taskPell;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            double sq = sqrt(2);
            double pell = ((Math.pow((1 + sq), n)) - (Math.pow((1 - sq), n))) / (sq * 2);
            System.out.println(Math.round(pell));
        }
    }
}
