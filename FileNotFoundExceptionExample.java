import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        File file = new File("missingfile.txt");

        try {
            // Check if file exists; if not, create it
            if (!file.exists()) {
                System.out.println("File does not exist. Creating the file...");
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            // Attempt to read from the file
            FileReader reader = new FileReader(file);
            System.out.println("File opened successfully for reading.");
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException handled: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
