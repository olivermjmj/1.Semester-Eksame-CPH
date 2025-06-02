import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("HelloThere1", "123HelloThere1"));
        users.add(new User("HelloThere2", "123HelloThere2", "HelloThere2@outlook.dk"));
        users.add(new User("HelloThere3", "123HelloThere3", "HelloThere3@outlook.dk", 45472947));

        Collections.sort(users);

        for(User user : users) {
            System.out.println(user);
        }
    }
}