package ex6;

import ex5.Circle;

public class MovableCircle extends Circle implements Movable {
  public void move () {
    System.out.println("Circle: I'm moving!");
  }
}