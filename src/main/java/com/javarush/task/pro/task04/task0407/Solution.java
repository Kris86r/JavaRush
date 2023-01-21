package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num % 3 == 0) {
                num++;
                continue;
            } else {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}





























