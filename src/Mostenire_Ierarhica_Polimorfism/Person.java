package Mostenire_Ierarhica_Polimorfism;public class Person {

  import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void describe() {
        System.out.println("Enter the name and age delimited by enter:");
    }

    public void whoIAm(String grade1) {
        System.out.println("I'm " + grade1);
    }

    public void whoIAm(String grade1, String grade2) {
        System.out.println("I'm " + grade1 + ", " + grade2);
    }

    public void whoIAm(String grade1, String grade2, String grade3) {
        System.out.println("I'm " + grade1 + ", " + grade2 + ", " + grade3);
    }

    public void whoIAm(String grade1, String grade2, String grade3, String grade4) {
        System.out.println("I'm " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
