package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList <String> friends = new ArrayList<>();
        friends.add("Chip");
        friends.add("Dale");
        friends.add("Monty");
        friends.add("Gadget");
        friends.add("Zipper");
        Collections.sort(friends);
        System.out.println(friends);



    }
}
