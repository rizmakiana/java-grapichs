package com.rizmakiana.pm1;

import javax.swing.*;
import java.awt.*;

public class AnimatedGrapichs extends JPanel {
    private int x2 = 50;
    private int y2 = 50;

    public AnimatedGrapichs(){
        // Timer jalan tiap 50ms
        Timer timer = new Timer(50, e -> {
            if (x2 < 700 && y2 < 600) {
                x2 += 5;  // geser ujung garis
                y2 += 5;
                repaint(); // panggil ulang paintComponent
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int y1 = 50;
        int x1 = 50;
        g.drawLine(x1, y1, x2, y2); // garis "bertumbuh"
    }
}
