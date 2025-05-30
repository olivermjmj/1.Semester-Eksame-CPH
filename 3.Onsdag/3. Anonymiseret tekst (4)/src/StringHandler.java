import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringHandler {

    public ArrayList<String> replaceText(String path, ArrayList<String> names) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String line = scan.nextLine();

                for(String name : names) {

                    if(line.startsWith(name))  {
                        line = line.replaceAll(name, "Den studerende");
                    } else {
                        line = line.replaceAll(name, "den studerende");
                    }
                }
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    public ArrayList<String> getNames() {

        ArrayList<String> names = new ArrayList<>();
        names.add("Katrine");
        names.add("Stine");
        names.add("Joakim");
        names.add("Anders");

        return names;
    }
}