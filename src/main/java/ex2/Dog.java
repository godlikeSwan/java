/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ex2;

public class Dog {
    private String name;
    private int age;

    public Dog (String n, int a) {
        name = n;
        age = a;
    }

    public Dog (String n) {
        name = n;
        age = 0;
    }

    public Dog () {
        name = "Pup";
        age = 0;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String toString () {
        return this.getName() + ", age " + this.getAge();
    }

    public void intoHumanAge () {
        System.out.print(getName() + "'s age in human years is " + age * 7 + " years");
    }

    public void bark () {
        System.out.print("bark bark");
    }
}
