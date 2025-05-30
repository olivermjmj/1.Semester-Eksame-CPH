import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop(FlowerShop.getFlowers());
        List<String> flowers = flowerShop.runDialog();

        if(flowerShop.getBouquetStatus()) {
            System.out.println("Du har købt en buket, af blomsterne:");
            for(String flower : flowers) {
                System.out.println(flower);
            }
        } else {
            System.out.println("Du har købt de individuelle blomster:");
            for(String flower : flowers) {
                System.out.println(flower);
            }
        }

        System.out.println("i alt, har du betalt: " + flowerShop.getTotal() + "kr.");
    }
}