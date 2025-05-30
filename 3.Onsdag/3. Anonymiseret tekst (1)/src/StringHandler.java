import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringHandler {

    public ArrayList<String> replaceText(String path) {

        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try(Scanner scan = new Scanner(file)) {

            while(scan.hasNextLine()) {
                scan.next(); //Skips the student's name
                String skip = scan.nextLine(); //We set a String that now holds the rest of the text, beside what we skipped at the beginning
                String line = "Den studerende" + skip;

                data.add(line);
            }

            scan.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}