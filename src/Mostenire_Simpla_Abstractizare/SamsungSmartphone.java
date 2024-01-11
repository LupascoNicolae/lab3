package Mostenire_Simpla_Abstractizare;public class SamsungSmartphone {

package Mostenire_Simpla_Abstractizare;

public class SamsungSmartphone implements SmartDevice {
    private int ram;
    private double weight;

    public SamsungSmartphone(int ram, double weight) {
        this.ram = ram;
        this.weight = weight;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRam() {
        return ram;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void color() {
        System.out.println("Blue");
    }

    @Override
    public void displaySize() {
        System.out.println("Screen size: 7cm");
    }

    @Override
    public String toString() {
        return "SamsungSmartphone{" +
                "ram=" + ram +
                ", weight=" + weight +
                '}';
    }
}
