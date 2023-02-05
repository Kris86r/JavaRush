package com.kris.swing.task0105;

import javax.swing.*;

public class InputDialogApplication {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "вы ввели такой текст:\n" + text);
    }
}
