import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("FirstUser", "123firstUser"));
        users.add(new User("SecondUser", "1234secondUser", "secondUser@outlook.dk"));
        users.add(new User("ThirdUser", "12345thirdUser", "thirdUser@outlook.dk", "27387218"));
        users.add(new User("Alpha", "123firstUser"));

        //Sorts the users alphabetically
        Collections.sort(users);

        for(User user : users) {
            System.out.println(user);
        }

    }
}