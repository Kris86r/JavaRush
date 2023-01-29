package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N;
        int num=0;
        while (scanner.hasNextInt() && scanner.nextInt() > 0) {
            N = new int[scanner.nextInt()];
            for (int i = 0; i<N.length; i++) {
                if (N[i]%2==0) {
                    num = N[i];
                } else  {
                    num = N[i-1];
                }
            }
        }
        System.out.println(num);
    }
}






























