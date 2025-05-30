import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> textFile = stringHandler.replaceText("data/text.csv");

        for(String line : textFile) {
            System.out.println(line);
        }
    }
}