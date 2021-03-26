package com.selab.tdd;

public class Square {
    private double side;
    public Square(double side) throws NegativeSideException {
        if (side < 0)
            throw new NegativeSideException();

        this.side = side;
    }

    public double computeArea() {
        return this.side * this.side;
    }

    public void setSide(double side) throws NegativeSideException {
        if (side < 0) {
            throw new NegativeSideException();
        }
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
}
