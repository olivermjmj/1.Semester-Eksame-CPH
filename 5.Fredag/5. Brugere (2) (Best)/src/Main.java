import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("FirstUser", "123FirstUser"));
        users.add(new User("SecondUser", "1234SecondUser", "SecondUser@outlook.dk"));
        users.add(new User("ThirdUser", "1234ThirdUser", "ThirdUser@outlook.dk", "28950219"));
        users.add(new User("Alpha", "123Alpha"));

        Collections.sort(users);

        for(User user : users) {
            System.out.println(user);
        }
    }
}