package Mostenire_Simpla_Abstractizare;public class Main {

public class Main {
    public static void main(String[] args) {
        SamsungSmartphone samsungPhone = new SamsungSmartphone(8, 150.5);
        WalnutTree walnutTree = new WalnutTree(15, 8.5, "Backyard", "Brown");

        samsungPhone.color();
        samsungPhone.displaySize();
        System.out.println(samsungPhone.toString());

        System.out.println("-----------------------------");

        System.out.println("Walnut Tree Details:");
        System.out.println("Owner: ");
        walnutTree.owner();
        System.out.println("Number of Leaves: " + walnutTree.numberOfLeaves());
        System.out.println(walnutTree.toString());
    }
}
