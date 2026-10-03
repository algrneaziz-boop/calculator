import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Error: cannot divide by zero");
            } else {
                System.out.println("Result: " + (a / b));
            }
        } else {
            System.out.println("Wrong operator");
        }
    }
}
