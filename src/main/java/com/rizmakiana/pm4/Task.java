package com.rizmakiana.pm4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Task extends JFrame {

    public Task() {
        super("Tugas Komputer Grafik Pertemuan 2");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        int x = 10;
        int y = 10;
        int side = 50;

        int i = 0;
        while (y + side < 720) {
            while (x < 1280) {
                if (i % 2 == 0) {
                    g.setColor(Color.WHITE);
                    g.fillOval(x, y, side, side);
                } else {
                    g.setColor(getColor());
                    g.fillRect(x, y, side, side);
                }
                i++;
                x += side + 10;
            }
            i++;
            x = 10;
            y += side + 10;
        }
    }

    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);
    }

}
