import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Path to the file to be read
        String filePath = "example.txt";
        
        // Use try-with-resources to ensure that resources are closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any IO exceptions that occur
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
