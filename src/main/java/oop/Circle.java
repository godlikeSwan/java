package oop;

public class Circle {
    Double r;
    String color;

    public Circle () {
        r = 5.0;
        color = "black";
    }

    public Circle (Double r) {
        this.r = r;
        color = "black";
    }

    public Circle (Double r, String color) {
        this.r = r;
        this.color = color;
    }

    public String getColor () {
        return color;
    }

    public Double getR () {
        return r;
    }

    public Double getP () {
        return 2 * Math.PI * r;
    }

    public Double getS () {
        return Math.PI * r * r;
    }

    public String toString () {
        return color + " circle, r = " + r;
    }
}