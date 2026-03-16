// Write a Java program to create an ArrayList of integers, add 10 elements (with duplicates),
// remove duplicate elements, and display the final list.

package java_file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class program80 {

    public static void main(String[] args) {

        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(
                10, 20, 10, 30, 40, 20, 50, 30, 60, 10
        ));

        System.out.println("Original ArrayList with duplicates: " + listWithDuplicates);

        Set<Integer> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println("ArrayList after removing duplicates: " + listWithoutDuplicates);
    }
}