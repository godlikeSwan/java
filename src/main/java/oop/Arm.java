package oop;

public class Arm extends BodyPart {
  public Arm () {
    this(70.0, 6.0);
  }

  public Arm (Double lenght, Double weight) {
    this.length = lenght;
    this.weight = weight;
  }
}