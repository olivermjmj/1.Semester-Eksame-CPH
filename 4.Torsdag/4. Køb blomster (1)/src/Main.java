import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop(FlowerShop.getFlowers());
        List<String> flowers = flowerShop.runDialog();

        System.out.println("Du har købt");
        for(String flower : flowers) {
            System.out.println(flower);
        }
    }
}