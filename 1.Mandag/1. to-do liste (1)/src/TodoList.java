import java.util.ArrayList;

public class TodoList {

    ArrayList<Item> items;

    public TodoList(ArrayList<Item> items) {
        this.items = items;
    }

    public void displayItems() {
        int count = 1;
        for(Item item : items) {
            System.out.println(count + ". " + item.getDescription() + ", " + (item.getIsDone() ? "done" : "not done")); //If true == "done" else "not done"
            count++;
        }
    }
}
