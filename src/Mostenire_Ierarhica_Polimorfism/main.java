package Mostenire_Ierarhica_Polimorfism;public class main {

  import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person person = new Person();
        WorkerPerson workerPerson = new WorkerPerson();
        EngineerPerson engineerPerson = new EngineerPerson();
        ResearcherPerson researcherPerson = new ResearcherPerson();

        System.out.println("Choose what you want to be: ");
        System.out.println("Person, WorkerPerson, EngineerPerson, ResearcherPerson");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        switch (str) {
            case "Person":
                person.whoIAm("person");
                person.describe();
                String name = scanner.next();
                person.setName(name);
                int age = scanner.nextInt();
                person.setAge(age);
                System.out.println(person.toString());
                break;

            case "WorkerPerson":
                person.whoIAm("person", "worker");
                workerPerson.describe();
                name = scanner.next();
                workerPerson.setName(name);
                age = scanner.nextInt();
                workerPerson.setAge(age);
                String profession = scanner.next();
                workerPerson.setProfession(profession);
                System.out.println(workerPerson.toString());
                break;

            case "EngineerPerson":
                person.whoIAm("person", "worker", "engineer");
                engineerPerson.describe();
                name = scanner.next();
                engineerPerson.setName(name);
                age = scanner.nextInt();
                engineerPerson.setAge(age);
                profession = scanner.next();
                engineerPerson.setProfession(profession);
                String specialization = scanner.next();
                engineerPerson.setSpecialization(specialization);
                System.out.println(engineerPerson.toString());
                break;

            case "ResearcherPerson":
                person.whoIAm("person", "worker", "engineer", "researcher");
                researcherPerson.describe();
                name = scanner.next();
                researcherPerson.setName(name);
                age = scanner.nextInt();
                researcherPerson.setAge(age);
                profession = scanner.next();
                researcherPerson.setProfession(profession);
                specialization = scanner.next();
                researcherPerson.setSpecialization(specialization);
                String domain = scanner.next();
                researcherPerson.setDomain(domain);
                System.out.println(researcherPerson.toString());
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
