

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String[] numbers = {"123", "456", "abc", "", "789.01"};

        for (String num : numbers) {
            try {
                int parsedNumber = Integer.parseInt(num);
                System.out.println("Parsed number: " + parsedNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + num + "' is not a valid integer.");
            }
        }
    }
}
