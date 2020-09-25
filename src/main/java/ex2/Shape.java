package ex2;

public class Shape {
    String name;
    int numberOfLines;
    int P;
    int S;
    String color;
    public Shape () {
        name = "dot";
        numberOfLines = 0;
        P = 0;
        S = 0;
        color = "black";
    }
    public Shape (String name, String color, int S, int P) {
        this.name = name;
        this.color = color;
        this.S = S;
        this.P = P;
        if (name == "Square") {
            this.numberOfLines = 4;
        }
    }
    public String toString () {
        return name + ", " + numberOfLines + " lines, " + "color: " + color + " P: " + P + " S: " + S;
    }
}