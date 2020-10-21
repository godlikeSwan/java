package ex7;

public class Cupboard extends Furniture {
  public Cupboard () {
    this(120, 60, 230, "big cupboard");
  }

  public Cupboard (int l, int w, int h, String n) {
    height = h;
    width = w;
    length = l;
    name = n;
  }
}