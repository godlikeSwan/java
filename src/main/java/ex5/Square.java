package ex5;

import ex5.Rectangle;

public class Square extends Rectangle {
  Square (Double a) {
    super(a, a);
  }

  Square () {
    this(10.0);
  }

  @Override
  public void setA(Double a) {
    super.setA(a);
    super.setB(a);
  }
}