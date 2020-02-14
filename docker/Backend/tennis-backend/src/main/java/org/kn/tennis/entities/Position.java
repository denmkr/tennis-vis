package org.kn.tennis.entities;

/**
 * Created by denis on 2/14/20.
 */

public class Position {
    private final double x;
    private final double y;

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
