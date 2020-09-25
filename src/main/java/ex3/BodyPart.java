package ex3;

public abstract class BodyPart {
  Double weight;
  Double length;

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public Double getLength() {
    return length;
  }

  public Double getWeight() {
    return weight;
  }
}