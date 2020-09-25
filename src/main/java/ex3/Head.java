package ex3;

public class Head extends BodyPart {
  String eyeColor;

  public Head () {
    this(30.0, 7.0, "brown");
  }

  public Head (Double length, Double weight, String eyeColor) {
    this.length = length;
    this.weight = weight;
    this.eyeColor = eyeColor;
  }

  public void setEyeColor (String color) {
    eyeColor = color;
  }
}