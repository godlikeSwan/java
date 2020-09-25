package ex6;

import ex5.Rectangle;

public class MovableRect extends Rectangle implements Movable {
  public void move () {
    System.out.println("Rect: I'm moving!");
  }
}