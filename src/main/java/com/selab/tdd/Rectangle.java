package com.selab.tdd;

public class Rectangle {
    private double width, height;
    public Rectangle(double width, double height) throws NegativeSideException {
        if (width < 0 || height < 0)
            throw new NegativeSideException();

        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return this.width * this.height;
    }
}
