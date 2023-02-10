package com.javarush.task.pro.task07.task0720;

public class BattleField {
    public static String galavirAttack = "враг наносит удар";
    public static String nimrodDefence = "вражеская атака отбита";
    public static String nimrodDestroy = "вражеский удар не выдержан";
    public static String galavirDefence = "наша атака успешно отражена врагом";
    public static String galavirDestroy = "вражеский коабль повержен";


    public static void main(String[] args) {
        GalavirXIII galavirXIII = new GalavirXIII();
        Nimrod nimrod = new Nimrod();
        do {
            System.out.println(galavirAttack);
            nimrod.defend(galavirXIII.attack());
        } while (isNimrodAlive(nimrod));

    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}
