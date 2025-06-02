import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    private ArrayList<String> flowers = new ArrayList<>();
    private int total;

    public FlowerShop(ArrayList<String> flowers) {
        this.flowers = flowers;
    }

    public void runDialog(int amountOfFlowersToBuy) {

        boolean whileTrue = true;
        ArrayList<String> boughtFlowers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //First question.
        while(whileTrue) {
            System.out.println("Ønsker du at købe 3 blomster? (Y/N)");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("y")) {

                int count = 1;
                for(String flower : this.flowers) {
                    System.out.println(count + ". " + flower);
                    count++;
                }

                //Shows the flower prices.
                printFlowerPrices();
                System.out.println("Nu kan du vælge de tre blomster du ønsker at købe");

                //Buy the flowers by picking a number between 1 and 10 over a span of 3 times (that includes 1 and 10)
                while(boughtFlowers.size() < amountOfFlowersToBuy) {
                    switch (scan.nextLine()) {
                        case "1"  : boughtFlowers.add(flowers.getFirst());    total += 20;
                        break;
                        case "2"  : boughtFlowers.add(flowers.get(1));        total += 20;
                        break;
                        case "3"  : boughtFlowers.add(flowers.get(2));        total += 20;
                        break;
                        case "4"  : boughtFlowers.add(flowers.get(3));        total += 20;
                        break;
                        case "5"  : boughtFlowers.add(flowers.get(4));        total += 40;
                        break;

                        case "6"  : boughtFlowers.add(flowers.get(5));        total += 40;
                        break;
                        case "7"  : boughtFlowers.add(flowers.get(6));        total += 40;
                        break;
                        case "8"  : boughtFlowers.add(flowers.get(7));        total += 80;
                        break;
                        case "9"  : boughtFlowers.add(flowers.get(8));        total += 80;
                        break;
                        case "10" : boughtFlowers.add(flowers.get(9));        total += 80;
                        break;

                        default : System.out.println("Vi sælger kun blomster mellem 1-10");
                        break;
                    }
                }

                //Wish to get a bouquet?
                while(whileTrue) {
                    System.out.println("Ønsker du at få disse tre blomster bundet sammen til en buket? (Y/N)");
                    answer = scan.nextLine();

                    if (answer.equalsIgnoreCase("y")) {

                        System.out.println("Du har købt en buket blomster med følgende i:");
                        for(String flower : boughtFlowers) {
                            System.out.println(flower);
                        }
                        System.out.println("Det totale blev: " + this.total);
                        total += 50;
                        whileTrue = false;
                    } else if(answer.equalsIgnoreCase("n")) {

                        System.out.println("Du har købt:");
                        for(String flower : boughtFlowers) {
                            System.out.println(flower);
                        }
                        System.out.println("Det totale blev: " + this.total);
                        whileTrue = false;
                    }
                }
            } else if(answer.equalsIgnoreCase("n")) {
                System.out.println("På gensyn.");
                System.exit(0);
            } else {
                System.out.println("Tryk y eller n for ja eller nej (Y/N)");
            }
        }
    }

    public static ArrayList<String> setFlowers() {

        ArrayList<String> flowers = new ArrayList<>();

        flowers.add("Rose");
        flowers.add("Påskelilje");
        flowers.add("Tulipan");
        flowers.add("Gras");
        flowers.add("Mælkebøtte");

        flowers.add("Sommerfuglebusk");
        flowers.add("Blåklokke");
        flowers.add("Solsikke");
        flowers.add("Valmue");
        flowers.add("Vintergæk");

        return flowers;
    }

    private void printFlowerPrices() {
        System.out.println(
                """
                Prisliste:
                Blomst 1-4: 20kr
                Blomst 5-7: 40kr
                Blomst 8-10: 80kr
                Buket: 50kr
                """
        );
    }
}
