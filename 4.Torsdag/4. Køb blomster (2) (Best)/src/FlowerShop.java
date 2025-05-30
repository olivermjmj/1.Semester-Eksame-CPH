import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {

    private final List<String> flowers;
    private int total;
    private boolean bouquet;

    public FlowerShop(List<String> flowers) {
        this.flowers = flowers;
    }

    public List<String> runDialog() {

        String StringAnswer;
        List<String> data = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        showFlowersAndPrices();

        //First question, about which flowers to buy
        while (true) {
            System.out.println("Ønsker du at købe 3 blomster? (Y/N)");
            StringAnswer = scan.nextLine();

            if(StringAnswer.equalsIgnoreCase("y")) {
                System.out.println("Tak for, at vælge at købe blomster, nu kan du vælge 3 blomster.");
                while(data.size() < 3) {
                    switch (scan.nextLine()) {
                        case "1" : data.add(this.flowers.getFirst()); this.total += 20;  System.out.println("Du valgte: " + this.flowers.getFirst());
                        break;
                        case "2" : data.add(this.flowers.get(1));     this.total += 20;  System.out.println("Du valgte: " + this.flowers.get(1));
                        break;
                        case "3" : data.add(this.flowers.get(2));     this.total += 20;  System.out.println("Du valgte: " + this.flowers.get(2));
                        break;
                        case "4" : data.add(this.flowers.get(3));     this.total += 20;  System.out.println("Du valgte: " + this.flowers.get(3));
                        break;
                        case "5" : data.add(this.flowers.get(4));     this.total += 40;  System.out.println("Du valgte: " + this.flowers.get(4));
                        break;
                        case "6" : data.add(this.flowers.get(5));     this.total += 40;  System.out.println("Du valgte: " + this.flowers.get(5));
                        break;
                        case "7" : data.add(this.flowers.get(6));     this.total += 40;  System.out.println("Du valgte: " + this.flowers.get(6));
                        break;
                        case "8" : data.add(this.flowers.get(7));     this.total += 40;  System.out.println("Du valgte: " + this.flowers.get(7));
                        break;
                        case "9" : data.add(this.flowers.get(8));     this.total += 80;  System.out.println("Du valgte: " + this.flowers.get(8));
                        break;
                        case "10": data.add(this.flowers.get(9));     this.total += 80;  System.out.println("Du valgte: " + this.flowers.get(9));
                        break;

                        default : System.out.println("Vi har kun blomster mellem 1-10");
                        break;

                    }
                }

                //Second question, about bouquet.
                while (true) {
                    System.out.println("Ønsker du at få dem sat sammen til en buket? (Y/N)");
                    StringAnswer = scan.nextLine();

                    if(StringAnswer.equalsIgnoreCase("y")) {

                        this.bouquet = true;
                        this.total += 50;

                        scan.close();
                        return data;
                    } else if(StringAnswer.equalsIgnoreCase("n")) {

                        scan.close();
                        return data;
                    } else {
                        System.out.println("Vær sød, at enten, sige ja eller nej");
                    }
                }
            //From first question. Closes the program, if user does not want to buy flowers.
            } else if (StringAnswer.equalsIgnoreCase("n")) {
                System.out.println("På gensyn");
                System.exit(0);
            //From first question. Tells the user, if he/she didn't manage to press "Y" or "N"
            } else {
                System.out.println("Y for ja og N for nej");
            }
        }
    }

    //Shows the user the list and prices of the flowers.
    public void showFlowersAndPrices() {

        //Shows flower prices
        System.out.println( """
                Prisliste:
                Blomst 1-4  : 20kr
                Blomst 5-7  : 40kr
                Blomst 8-10 : 80kr
                Buket       : 50kr
                            """
        );

        //Shows the flower list
        for(int i = 0; i < this.flowers.size(); i++) {
            System.out.println((i + 1) + ". " + this.flowers.get(i));
        }
    }

    //Returns a list of what flowers that are for sale.
    public static List<String> getFlowers() {
        List<String> data = new ArrayList<>();

        data.add("Rose");
        data.add("Tulipan");
        data.add("Lilje");
        data.add("Orkide");
        data.add("Solsikke");

        data.add("Nellike");
        data.add("Hyacint");
        data.add("Anemone");
        data.add("Valmue");
        data.add("Stedmoderblomst");

        return data;
    }

    //Getter for finding out if the user wanted a bouquet or not.
    public boolean getBouquetStatus() {
        return this.bouquet;
    }

    //Getter for the total amount of money that has been spent.
    public int getTotal() {
        return this.total;
    }
}
