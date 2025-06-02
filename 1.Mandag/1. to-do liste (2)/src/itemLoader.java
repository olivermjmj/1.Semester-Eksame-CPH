import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class itemLoader {

    ArrayList<Item> loadFile(String path) {

        ArrayList<Item> data = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();    // Skips header

            while (scan.hasNextLine()) {

                String[] lineSplitter = scan.nextLine().split(",");
                Item items = new Item(lineSplitter[0].trim(), lineSplitter[1].trim().equalsIgnoreCase("Done"));
                data.add(items);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error with the scanner that handles todo.csv: " + e.getMessage());
        }

        return data;
    }
}
