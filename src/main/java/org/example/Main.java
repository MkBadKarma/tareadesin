package org.example;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame miFrame = new JFrame("Jenkins");

        JLabel miLabel = new JLabel("trabajo desin");

        miFrame.add(miLabel);

        miFrame.setSize(300, 200);

        miFrame.setVisible(true);
    }
}
