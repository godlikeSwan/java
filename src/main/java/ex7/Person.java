package ex7;

import java.util.Stack;

public class Person {
  String name;
  Stack basket;

  public Person () {
    this("Vasya");
  }

  public Person (String name) {
    this.name = name;
    basket = new Stack();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addToBasket (Furniture f) {
    basket.push(f);
  }

  public String buy () {
    String a = "";
    while (!basket.empty()) {
      a = a + basket.pop() + "\n";
    }

    return a;
  }
}