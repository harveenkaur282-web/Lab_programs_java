//Open a file using FileInputStream, read its content and diplay on screen.
//(Remember to create a file in Java using FileOutputStream class and enter data into
//it before opening it.)
package java_file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class program79 {
    public static void main(String[] args) {
        String file = "example.txt";
        String data = "Hello, this is data!";
        try(FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes());
            System.out.println("Data written");
        } catch(IOException e) {
            System.out.println("Error occured!");
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream(file)){
            int content;
            System.out.println("Reading data:");
            while((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\nFinished reading file");
        } catch (IOException e){
            System.out.println("Error occured!");
            e.printStackTrace();
        }
    }
}