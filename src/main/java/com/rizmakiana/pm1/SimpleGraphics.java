package com.rizmakiana.pm1;

import javax.swing.*;
import java.awt.*;

public class SimpleGraphics extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(50, 50, 200, 200);
        g.drawOval(100, 100, 80, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Komputer Grafik");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.add(new SimpleGraphics());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

