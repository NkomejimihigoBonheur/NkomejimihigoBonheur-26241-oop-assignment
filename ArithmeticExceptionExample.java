

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
