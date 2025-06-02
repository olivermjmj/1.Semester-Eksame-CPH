import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> newText = stringHandler.replaceText("data/text.csv", stringHandler.getNames());

        for(String text : newText) {
            System.out.println(text);
        }
    }
}