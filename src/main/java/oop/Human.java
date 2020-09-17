package oop;

public class Human {
  String name;
  Head head;
  Arm leftArm;
  Arm rightArm;
  Core core;
  Leg leftLeg;
  Leg rightLeg;

  public Human () {
    this("Vasya");
  }

  public Human (String name) {
    this.name = name;
    head = new Head();
    leftArm = new Arm();
    rightArm = new Arm();
    core = new Core();
    leftLeg = new Leg();
    rightLeg = new Leg();
  }

  public Double getHeight () {
    return head.getLength() + core.getLength() + leftLeg.getLength();
  }

  public Double getWeight () {
    return head.getWeight() + leftArm.getWeight() + rightArm.getWeight() +
    core.getWeight() + leftLeg.getWeight() + rightLeg.getWeight();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + "; height: " + getHeight() + "; weight: " + getWeight();
  }
}