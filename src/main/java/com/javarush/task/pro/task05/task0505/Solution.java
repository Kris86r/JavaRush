package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
       while (num<scanner.nextInt()){
           int N = scanner.nextInt();
           int[] array = new int[N];
           num++;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 != 0) {
                    array[j] = array.length - j;
                    num = array[j];
                } else {
                    num = array[j];
                }
            }
        }
        System.out.println(num);
    }
}






























