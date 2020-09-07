package oop;

public class Ball {
  String color;
  Double x;
  Double y;
  Double r;
  Double v;

  public Ball () {
    color = "white";
    x = 0.0;
    y = 0.0;
    r = 10.0;
    v = 0.0;
  }

  public Ball (Double x, Double y) {
    color = "white";
    this.x = x;
    this.y = y;
    r = 10.0;
    v = 0.0;
  }

  public Ball (Double x, Double y, Double r, String color) {
    this.color = color;
    this.x = x;
    this.y = y;
    this.r = r;
    v = 0.0;
  }

  public void hit () {
    v += 5.0;
  }

  public void hit (Double f) {
    v += f;
  }

  public void stop () {
    v = 0.0;
  }
}