package com.selab.tdd;

public class Rectangle {
    private double w, h;
    public Rectangle(double i, double i1) throws NegativeSideException {
        if (i < 0)
        {
            throw new NegativeSideException();
        }
        else if (i1 < 0)
        {
            throw new NegativeSideException();
        }
        w = i;
        h = i1;
    }

    public double computeArea() {
        return w*h;
    }
}
