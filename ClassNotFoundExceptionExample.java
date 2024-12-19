

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred!");
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

