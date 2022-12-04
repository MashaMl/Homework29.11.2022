package Task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> teachers = new ArrayList<>();
        teachers.add("Oleksandra Vladimirovna");
        teachers.add("Lubov Ivanovna");
        teachers.add("Tatiana Viktorovna");
        teachers.add("Natalia Vladimirovna");
        teachers.add("Mihail Mihailovich");
        int theBest = teachers.indexOf("Lubov Ivanovna");
        int theWorst = teachers.indexOf("Tatiana Viktorovna");
        System.out.println("List of teachers: " + teachers);
        System.out.println("The best is " + teachers.get(theBest));
        System.out.println("The worst is " + teachers.get(theWorst));
    }
}
