package ex5;

import ex5.Shape;

public class Circle extends Shape {
  Double r;

  public Circle (Double r) {
    this.r = r;
  }

  public Circle () {
    this(10.0);
  }

  public void setR (Double r) {
    this.r = r;
  }

  public Double getR () {
    return r;
  }

  @Override
  public Double getP () {
    return Math.PI * 2 * r;
  }

  @Override
  public Double getS () {
    return Math.PI * r * r;
  }
}