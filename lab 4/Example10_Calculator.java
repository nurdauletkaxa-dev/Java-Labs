// Пример 10
// По двум числам и операции (+, -, *, /)
// определить результат вычисления

import java.util.Scanner;

public class Example10_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат: " + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
                break;
            default:
                System.out.println("Неверная операция");
        }

        scanner.close();
    }
}
