package java_file;
import java.util.LinkedList;
import java.util.List;
public class program83 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Initail empty list: " + list);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List after initialing additions (1, 2, 3): " + list);
        list.addFirst(0);
        System.out.println("Adding element in the beginning" + list);
        list.addLast(4);
        System.out.println("Adding element in the last" + list);
        int middle = list.size()/2;
        list.add(middle, 100);
        System.out.println("Adding element in the middle" + list);
        Integer valueRemove = 100;
        boolean removed = list.remove(valueRemove);
        System.out.println("After removing element" + list);
    }
}