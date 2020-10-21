package ex7;

public class FurnitureShop {
  Furniture[] list;

  public FurnitureShop () {
    Cupboard c = new Cupboard();
    Table t = new Table();
    list[0] = c;
    list[1] = t;
  }
}