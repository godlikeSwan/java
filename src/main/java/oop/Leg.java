package oop;

public class Leg extends BodyPart {
  public Leg () {
    this(70.0, 10.0);
  }

  public Leg (Double length, Double weight) {
    this.length = length;
    this.weight = weight;
  }
}