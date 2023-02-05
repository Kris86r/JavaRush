package com.kris.swing.task0102;

import javax.swing.*;

public class ShowMeNewWindowApplication {
    public static void main(String[] args) {
        String title = "message";
        String text = "Kris";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.QUESTION_MESSAGE);
    }
}
