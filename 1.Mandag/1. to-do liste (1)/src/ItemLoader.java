import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ItemLoader {


    public ArrayList<Item> loadFile(String path) {

        ArrayList<Item> data = new ArrayList<>();
        File file = new File(path);

        try {

            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skips header

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineSplitter = line.split(","); //The String array[] is now 2 long

                Item items = new Item();
                items.setDescription(lineSplitter[0].trim());
                items.setIsDone(lineSplitter[1].trim().equalsIgnoreCase("done"));
                data.add(items);
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}
