import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemLoader {

    ArrayList<Item> loadFile(String path) {

        ArrayList<Item> data = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skips header

            while(scan.hasNextLine()) {

                String[] lineSplitter = scan.nextLine().trim().split(",");
                Item item = new Item(lineSplitter[0].trim(), lineSplitter[1].trim().equalsIgnoreCase("Done"));
                data.add(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}