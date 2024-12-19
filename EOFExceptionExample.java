

import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("example.txt"))) {
            while (true) {
                dis.readByte();
            }
        } catch (EOFException e) {
            System.out.println("EOFException handled: End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
