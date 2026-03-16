package java_file;

import java.util.HashMap;
import java.util.Map;

public class program81 {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Tom", 95);
        marks.put("Sam", 57);
        marks.put("Joy", 83);
        marks.put("Lily", 71);

        // Print all students
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String top = null;
        int highestMarks = Integer.MIN_VALUE;

        // Find student with highest marks
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            int currentMarks = entry.getValue();

            if (currentMarks > highestMarks) {
                highestMarks = currentMarks;
                top = entry.getKey();
            }
        }

        // Print result
        if (top != null) {
            System.out.println("Student with highest marks: " + top);
            System.out.println("Highest marks: " + highestMarks);
        } else {
            System.out.println("No data found!");
        }
    }
}