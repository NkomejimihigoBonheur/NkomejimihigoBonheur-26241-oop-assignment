import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            
            // Check if the file exists, if not, create it
            if (!file.exists()) {
                System.out.println("File does not exist. Creating file...");
                file.createNewFile();
            }

            // Read from the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            if (line == null) {
                System.out.println("The file is empty.");
            } else {
                System.out.println("First line of the file: " + line);
            }

            reader.close(); // Close the reader

        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }
}
