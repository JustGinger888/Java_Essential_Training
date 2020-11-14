import java.util.InputMismatchException;
import java.util.Scanner;

public class complexCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        try {
            num1 = getNumber(scanner, "Enter First Numeric Vale: ");
            scanner.nextLine();
            num2 = getNumber(scanner, "Enter Second Numeric Vale: ");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Couldn't Format as a Number");
            return;
        }

        System.out.print("Enter Operation To Be Performed (+ - / *): ");
        var operation = scanner.nextLine();

        double answer;
        switch (operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
            default:
                System.out.println("Invalid Operation");
                return;
        }

        System.out.println(answer);
    }

    private static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}
