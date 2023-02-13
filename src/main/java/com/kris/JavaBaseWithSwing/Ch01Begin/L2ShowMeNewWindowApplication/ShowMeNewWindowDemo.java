package com.kris.JavaBaseWithSwing.Ch01Begin.L2ShowMeNewWindowApplication;

import javax.swing.*;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {
        String title = "message";
        String text = "Kris";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.QUESTION_MESSAGE);
    }
}
