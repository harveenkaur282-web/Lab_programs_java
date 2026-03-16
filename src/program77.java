//Write a program to create a file in Java using FileOutputStream class and enter
//byte data into it.
package java_file;
import java.io.FileOutputStream;
import java.io.IOException;
public class program77{
    public static void main(String[] args) {
        String data = "Hello, FileOutputStream in Java!";
        byte[] byteData = data.getBytes();
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(byteData);
            System.out.println("Data written successfully to output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}