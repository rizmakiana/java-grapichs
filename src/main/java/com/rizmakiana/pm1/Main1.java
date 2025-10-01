package com.rizmakiana.pm1;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Garis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.add(new AnimatedGrapichs());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
