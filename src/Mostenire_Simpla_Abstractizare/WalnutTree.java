package Mostenire_Simpla_Abstractizare;public class WalnutTree {

package Mostenire_Simpla_Abstractizare;

public class WalnutTree extends Vegetation {
    private String fruitColor;

    public WalnutTree(int years, double height, String location, String fruitColor) {
        super(years, height, location);
        this.fruitColor = fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public String getFruitColor() {
        return this.fruitColor;
    }

    @Override
    public void owner() {
        System.out.println("The owner is Nicolae");
    }

    @Override
    public int numberOfLeaves() {
        return 19283;
    }

    @Override
    public String toString() {
        return "WalnutTree{" +
                "height=" + super.getHeight() +
                ", years=" + super.getYears() +
                ", location='" + super.getLocation() + '\'' +
                ", fruitColor='" + this.fruitColor + '\'' +
                '}';
    }
}
