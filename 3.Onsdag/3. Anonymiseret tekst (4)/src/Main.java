import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> data = stringHandler.replaceText("data/text.csv", stringHandler.getNames());

        for(String name : data) {
            System.out.println(name);
        }
    }
}