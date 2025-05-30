import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();

        ArrayList<String> names = StringHandler.getNames();
        ArrayList<String> text = stringHandler.replaceText("data/text.csv", names);

        for(String line : text) {
            System.out.println(line);
        }
    }
}