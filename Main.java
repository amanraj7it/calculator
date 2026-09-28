import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

class AdvancedCalculator extends Calculator {
    int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");

        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvancedCalculator cal = new AdvancedCalculator();

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter operator: ");
            char op = sc.next().charAt(0);

            int result;

            switch (op) {
                case '+':
                    result = cal.add(a, b);
                    break;

                case '-':
                    result = cal.subtract(a, b);
                    break;

                case '*':
                    result = cal.multiply(a, b);
                    break;

                case '/':
                    result = cal.divide(a, b);
                    break;

                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("Result = " + result);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
