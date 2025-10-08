package com.rizmakiana.pm5;

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
        int x = 100;
        int y = 100;
        int side = 75;
        for (int i = 0; i < 6; i++) {
            int corner = 60;
            for (int j = 0; j < 6; j++) {
                g.setColor(getColor());
                if (i % 2 == 0) {
                    g.fillArc(x, y, side, side, 0, corner);
                } else {
                    g.drawArc(x, y, side, side, 0, corner);
                }
                x += 200;
                corner += 60;
            }
            y += 100;
            x = 100;
        }
    }

    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);
    }

    
    
}
