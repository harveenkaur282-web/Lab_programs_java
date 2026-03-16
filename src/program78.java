//Write a program to create a file in Java using FileOutputStream class and enter
//String data into it.
package java_file;
import java.io.FileOutputStream;
import java.io.IOException;
public class program78 {
    public static void main(String[] args) {
        String data = "Hello, World! This data is being written to a file using FileOutputStream.";
        String fileName = "output.txt";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Successfully wrote data to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}