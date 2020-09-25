package ex6;

public class MovablePoint implements Movable {
  String color;

  MovablePoint (String color) {
    this.color = color;
  }

  MovablePoint () {
    this("red");
  }

  public void move () {
    System.out.println("Point: I'm moving!");
  }
}