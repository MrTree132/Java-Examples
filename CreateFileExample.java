import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "out.txt"; // specify the file name
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }
}
