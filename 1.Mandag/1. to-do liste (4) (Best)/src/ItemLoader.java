import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemLoader {

    public ArrayList<Item> loadFile(String path) {

        ArrayList<Item> data = new ArrayList<>();
        File file = new File(path);

        try(Scanner scan = new Scanner(file)) {

            scan.nextLine(); //Skips header
            while(scan.hasNextLine()) {

                String[] splitter = scan.nextLine().split(",");
                Item item = new Item(splitter[0],splitter[1].trim().equalsIgnoreCase("done"));
                data.add(item);
            }

            scan.close();
            return data;
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}