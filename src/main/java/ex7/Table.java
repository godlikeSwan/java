package ex7;

public class Table extends Furniture {
  public Table () {
    this(120, 90, 80, "big table");
  }

  public Table (int l, int w, int h, String n) {
    height = h;
    width = w;
    length = l;
    name = n;
  }
}