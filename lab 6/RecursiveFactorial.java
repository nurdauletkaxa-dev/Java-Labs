import java.util.Scanner;

public class RecursiveFactorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не существует.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        try {
            long result = factorial(n);
            System.out.println("Факториал " + n + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}