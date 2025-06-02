import java.util.ArrayList;

public class TodoList {

    private ArrayList<Item> items;

    public TodoList(ArrayList<Item> items) {
        this.items = items;
    }

    public void displayItems() {

        int count = 1;
        for(Item item : items) {
            System.out.println(count + ". " + item.getDescription() + " isDone? " + (item.getIsDone() ? "done" : "not done"));
            count++;
        }
    }
}