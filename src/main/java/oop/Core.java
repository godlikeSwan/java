package oop;

public class Core extends BodyPart {
  String body;

  public Core () {
    this(70.0, 31.0, "well-built");
  }

  public Core (Double length, Double weight, String body) {
    this.length = length;
    this.weight = weight;
    this.body = body;
  }

  public String getBody () {
    return body;
  }

  public void setBody (String body) {
    this.body = body;
  }
}