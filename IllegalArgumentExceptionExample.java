

public class IllegalArgumentExceptionExample {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            double validResult = calculateSquareRoot(16);
            System.out.println("Square root of 16 is: " + validResult);

            double invalidResult = calculateSquareRoot(-9); // Throws exception
            System.out.println("Square root of -9 is: " + invalidResult);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}
