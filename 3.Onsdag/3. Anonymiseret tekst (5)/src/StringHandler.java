import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringHandler {

    public ArrayList<String> replaceText(String path, ArrayList<String> names) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try(Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                for(String name : names) {
                    line = line.replaceAll(name, "Den studerende");
                }

                data.add(line);
            }

            scan.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    public ArrayList<String> getNames() {

        ArrayList<String> data = new ArrayList<>();
        data.add("Katrine");
        data.add("Stine");
        data.add("Joakim");
        data.add("Anders");

        return data;
    }
}