package com.rizmakiana.pm2;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Rectangle extends JFrame {

    private Double side;

    public Rectangle(Double side){
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public void paint(Graphics arg0) {
        // TODO Auto-generated method stub
        super.paint(arg0);
    }


}
