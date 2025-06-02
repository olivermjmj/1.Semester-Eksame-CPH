import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> lines = stringHandler.replaceText("data/text.csv");

        for(String line : lines) {
            System.out.println(line);
        }
    }
}