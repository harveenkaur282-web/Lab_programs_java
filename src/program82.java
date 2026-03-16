package java_file;
import java.util.TreeSet;
import java.util.Iterator;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("John");
        name.add("Sam");
        name.add("Tom");
        name.add("Joy");
        name.add("John");
        name.add("Lily");
        name.add("Tom");
        System.out.println("Elements: ");
        Iterator<String> iterator = name.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
        try {
            String first = name.first();
            String last = name.last();
            System.out.println("First element: " + first);
            System.out.println("Last element: " + last);
        } catch(java.util.NoSuchElementException e) {
            System.out.println("Set is empty");
        }
    }
}