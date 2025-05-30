import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> fullText = stringHandler.replaceText("data/text.csv", stringHandler.getNames());

        for(String text : fullText) {
            System.out.println(text);
        }
    }
}