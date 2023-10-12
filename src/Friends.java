import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Віталік");
        friends.add("Паша");
        friends.add("Саша");
        friends.add("Андрій");

        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
    }
}
