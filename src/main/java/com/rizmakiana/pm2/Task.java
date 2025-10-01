package com.rizmakiana.pm2;

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
        int x1 = 20; int y1 = 20;
        int x2 = 20; int y2 = 680;

        for(int i = 0; i < 5; i++){
            g.drawLine(x1, y1, x2, y2);
            x1 += 50;
            x2 += 50;
        }

        x1 = 270; y1 = 20;
        x2 = 1260; y2 = 20;

        for(int i = 0; i < 5; i++){
            g.drawLine(x1, y1, x2, y2);
            y1 += 50;
            y2 += 50;
        }

        x1 = 270; y1 = 270;
        x2 = 100; y2 = 100;

        for(int i = 0; i < 5; i++){
            g.drawRect(x1, y1, x2, y2);
            x2 += 100;
        }      
        
        x1 = 820; y1 = 270;
        x2 = 70; y2 = 70;

        for(int i = 0; i < 5; i++){
            g.drawRect(x1, y1, x2, y2);
            y2 += 70;
        }        

    }    
}
