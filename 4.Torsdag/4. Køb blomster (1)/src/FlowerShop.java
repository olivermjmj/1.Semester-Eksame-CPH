import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FlowerShop {

    private List<String> flowers = new ArrayList<>();
    private int total;

    public FlowerShop(List<String> flowers) {
        this.flowers = flowers;
    }


    public List<String> runDialog() {

        boolean validInput;
        String answer;
        List<String> data = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // First question: See flowers
        validInput = false;
        while(!validInput) {
            System.out.println("Velkommen til Røde, vil du se, hvilke blomster vi har på lager? (Y/N)");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                for (String flower : flowers) {
                    System.out.println(flower);
                }
                showFlowerPrices();
                validInput = true;
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("Hav en god dag.");
                System.exit(0);
            } else {
                System.out.println("Du skal enten klikke Y for ja, eller N for nej");
            }
        }

        //Second question: Buy flowers
        validInput = false;
        while (!validInput) {
            System.out.println("Ønsker du, at købe nogle af disse blomster? (Y/N), du bør vide at du skal købe 3 blomster, hvis du siger ja");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Du kan købe blomsten ved at vælge dens tal, så fx hvis du vil købe en rose, så skriv 1");

                while (data.size() < 3) {

                    switch (scan.nextInt()) {
                        case 1:
                            data.add(flowers.get(0));
                            total += 20;
                            break;
                        case 2:
                            data.add(flowers.get(1));
                            total += 20;
                            break;
                        case 3:
                            data.add(flowers.get(2));
                            total += 20;
                            break;
                        case 4:
                            data.add(flowers.get(3));
                            total += 20;
                            break;
                        case 5:
                            data.add(flowers.get(4));
                            total += 40;
                            break;
                        case 6:
                            data.add(flowers.get(5));
                            total += 40;
                            break;
                        case 7:
                            data.add(flowers.get(6));
                            total += 40;
                            break;
                        case 8:
                            data.add(flowers.get(7));
                            total += 80;
                            break;
                        case 9:
                            data.add(flowers.get(8));
                            total += 80;
                            break;
                        case 10:
                            data.add(flowers.get(9));
                            total += 80;
                            break;
                        default:
                            System.out.println("Beklager, det tilbyder vi ikke, vær sød at vælg noget andet.");
                            break;

                    }
                }

                System.out.println("Fantastiske valg, det vil koste: " + total + ".");
                return data;

            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("Hav en god dag.");
                System.exit(0);
            } else {
                System.out.println("Du skal enten klikke Y for ja, eller N for nej");
            }
        }
        return data;
    }

    public static List<String> getFlowers() {

        List<String> flowers = new ArrayList<>();

        flowers.add("1. Rose");
        flowers.add("2. Tulipan");
        flowers.add("3. Lilje");
        flowers.add("4. Orkide");
        flowers.add("5. Solsikke");

        flowers.add("6. Nellike");
        flowers.add("7. Hyacint");
        flowers.add("8. Anemone");
        flowers.add("9. Valmue");
        flowers.add("10. Stedmoderblomst");

        return flowers;
    }

    public void showFlowerPrices() {

        System.out.println("Prisliste: " + "\n" +
                "Blomst 1-4 : 20kr" + "\n" +
                "Blomst 5-7 : 40kr" + "\n" +
                "Blomst 8-10: 80kr" + "\n"
        );
    }
}
