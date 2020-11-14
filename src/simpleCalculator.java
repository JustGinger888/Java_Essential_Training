import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter A Numeric Vale: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter A Numeric Vale: ");
        double num2 = scanner.nextDouble();

        double answer = num1/num2;
        System.out.println(answer);
    }

}
