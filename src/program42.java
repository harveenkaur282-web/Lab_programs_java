//WAP to create ArrayList. Also add, remove, change and clear the elements of ArrayList
import java.util.*;
class program42{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Black");
        list.add("White");
        list.add("Blue");
        System.out.println("After adding: " + list);

        list.remove("Blue");
        System.out.println("After removing: " + list);

        list.set(1, "Orange");
        System.out.println("After changing: " + list);

        list.clear();
        System.out.println("After clearing: " + list);
    }
}
