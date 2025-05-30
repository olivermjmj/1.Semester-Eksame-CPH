public class Main {
    public static void main(String[] args) {

        itemLoader itemLoader = new itemLoader();
        TodoList todoList = new TodoList(itemLoader.loadFile("data/todo.csv"));
        todoList.displayItems();

    }
}