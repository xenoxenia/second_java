package com.company.java8Shapes;

import java.awt.*;
import java.util.Random;

public class Triangle extends Figure {
    Graphics g;
    int x3, y3;
    Random random = new Random();

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2);
        setX3(x3);
        setY3(y3);
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    int[] x = {x1, x2, x3};
    int[] y = {y1, y2, y3};
    int n = (int)(Math.random()*50);


    public int getN() {
        return n;
    }


    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    @Override
    public void painting(Graphics g) {
        g.drawPolygon(getX(), getY(), getN());
        g.fillPolygon(getX(), getY(), getN());
    }

    @Override
    public void setColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        Color color = new Color(r, g, b);
    }

    @Override
    public void go() {
        setColor();
        painting(g);
    }
}