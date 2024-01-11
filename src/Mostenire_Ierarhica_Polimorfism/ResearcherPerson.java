package Mostenire_Ierarhica_Polimorfism;public class ResearcherPerson {

package Mostenire_Ierarhica_Polimorfism;

import java.util.Scanner;

public class ResearcherPerson extends EngineerPerson {
    private String domain;

    public ResearcherPerson(String name, int age, String profession, String specialization, String domain) {
        super(name, age, profession, specialization);
        this.domain = domain;
    }

    public ResearcherPerson() {}

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public void describe() {
        System.out.println("Enter the name, age, profession, specialization and domain delimited by enter: ");
    }

    @Override
    public String toString() {
        return "ResearcherPerson{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                ", profession=" + super.getProfession() +
                ", specialization=" + super.getSpecialization() +
                ", domain=" + this.getDomain() +
                '}';
    }
}
