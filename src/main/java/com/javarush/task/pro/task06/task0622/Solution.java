package com.javarush.task.pro.task06.task0622;

import java.util.Scanner;


public class Solution {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;


    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
    }

    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == diabloPosition) {
                System.out.println(findDiabloPhrase);
                return;
            }
            System.out.println(getPositionPhrase);
        }
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static void amigoLostLife() {
        amigoLives -= 1;
    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloDefends() {
        return getRandomNumber(3);
    }
}






























