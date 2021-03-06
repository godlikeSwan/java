package ex4;

import java.util.jar.Attributes.Name;

public class Author {
  String name;
  String email;
  char gender;

  Author (String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return name + " " + email + " " + gender;
  }
}