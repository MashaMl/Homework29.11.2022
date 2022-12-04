package Task2Task3;

import java.util.ArrayList;

public class Zoo {
    static ArrayList <String> magicZoo = new ArrayList<>();

    public static void main(String[] args) {
        magicZoo.add("Unicorn");
        magicZoo.add("Thestral");
        magicZoo.add("Owl");
        magicZoo.add("Niffler");
        magicZoo.add("Rat");
        magicZoo.add("Toad");
        magicZoo.add("Cat");
        magicZoo.add("Phoenix");
        System.out.println(magicZoo);

       //Task3
        magicZoo.remove(7);
        magicZoo.remove(5);
        magicZoo.remove(3);
        System.out.println(magicZoo.size());



    }
}
