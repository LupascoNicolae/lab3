package Mostenire_Ierarhica_Polimorfism;public class EngineerPerson {
}
import java.util.Scanner;

public class EngineerPerson extends WorkerPerson {
    private String specialization;

    public EngineerPerson(String name, int age, String profession, String specialization) {
        super(name, age, profession);
        this.specialization = specialization;
    }

    public EngineerPerson() {}

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void describe() {
        System.out.println("Enter the name, age, profession and specialization delimited by enter: ");
    }

    @Override
    public String toString() {
        return "EngineerPerson{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                ", profession=" + super.getProfession() +
                ", specialization=" + this.getSpecialization() +
                '}';
    }
}
