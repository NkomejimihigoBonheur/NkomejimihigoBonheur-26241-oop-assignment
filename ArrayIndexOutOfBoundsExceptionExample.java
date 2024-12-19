

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int invalidIndexValue = numbers[5]; // Invalid index
            System.out.println("Value at index 5: " + invalidIndexValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
