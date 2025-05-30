public class Main {
    public static void main(String[] args) {

        ItemLoader itemLoader = new ItemLoader();
        TodoList todoList = new TodoList(itemLoader.loadFile("data/todo.csv"));
        todoList.displayItems();
    }
}