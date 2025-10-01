package com.rizmakiana.pm3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Task extends JFrame{  
    public Task(){
        super("Tugas Komputer Grafik Pertemuan 2");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        int x = 20;
        int side = 100;

        for (int i = 0; i < 5; i++) {
            g.fillOval(x, x, side, side);
            x += side;
        }

        int y = x - side;
        x = 20;
        for (int i = 0; i < 5; i++){
            g.drawOval(x, y, side, side);
            x += side;
            y -= side;
        }

        g.drawArc(820, 120 , 250, 250, 105, 221);
        g.drawArc(890, 70, 250, 250, 145, 140);


    }

    
}
