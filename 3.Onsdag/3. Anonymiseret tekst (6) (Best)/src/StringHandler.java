import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringHandler {

    public ArrayList<String> replaceText(String path) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try(Scanner scan = new Scanner(file)) {


            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                for(String name : getStudentNames()) {

                    line = line.replace(name,"Den studerende");
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

    private ArrayList<String> getStudentNames() {

        ArrayList<String> names = new ArrayList<>();

        names.add("Katrine");
        names.add("Stine");
        names.add("Joakim");
        names.add("Anders");

        return names;
    }
}
