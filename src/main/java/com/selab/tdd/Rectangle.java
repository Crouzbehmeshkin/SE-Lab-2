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
    
    public void setHeight(double height) throws NegativeSideException {
        if (height < 0) {
            throw new NegativeSideException();
        }
        this.height = height;
    }

    public void setWidth(double width) throws NegativeSideException {
        if (width < 0) {
            throw new NegativeSideException();
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
