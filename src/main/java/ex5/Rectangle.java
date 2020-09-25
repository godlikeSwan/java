package ex5;

import ex5.Shape;

public class Rectangle extends Shape {
  Double a;
  Double b;

  public Rectangle (Double a, Double b) {
    this.a = a;
    this.b = b;
  }

  public Rectangle () {
    this(10.0, 20.0);
  }

  public void setA (Double a) {
    this.a = a;
  }

  public void setB (Double b) {
    this.b = b;
  }

  public Double getA () {
    return a;
  }

  public Double getB () {
    return b;
  }

  @Override
  public Double getP() {
    return (a + b) * 2;
  }

  @Override
  public Double getS() {
    return a * b;
  }
}