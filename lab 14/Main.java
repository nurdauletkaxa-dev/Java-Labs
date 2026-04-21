import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите задачу (1-10): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: sumToN(); break;
            case 2: countDigits(); break;
            case 3: multiplicationTable(); break;
            case 4: maxDigit(); break;
            case 5: palindromeCheck(); break;
            case 6: countEvenDigits(); break;
            case 7: randomUntilZero(); break;
            case 8: sumUntilZero(); break;
            case 9: passwordCheck(); break;
            case 10: findMin(); break;
            default: System.out.println("Неверный выбор");
        }
    }

    // Задача 1
    static void sumToN() {
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Сумма: " + sum);
    }

    // Задача 2
    static void countDigits() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int count = String.valueOf(Math.abs(n)).length();
        System.out.println("Количество цифр: " + count);
    }

    // Задача 3
    static void multiplicationTable() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    // Задача 4
    static void maxDigit() {
        System.out.print("Введите число: ");
        int n = Math.abs(scanner.nextInt());
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) max = digit;
            n /= 10;
        }
        System.out.println("Максимальная цифра: " + max);
    }

    // Задача 5
    static void palindromeCheck() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int original = n, reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }

    // Задача 6
    static void countEvenDigits() {
        System.out.print("Введите число: ");
        int n = Math.abs(scanner.nextInt());
        int count = 0;

        while (n > 0) {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        }

        System.out.println("Чётных цифр: " + count);
    }

    // Задача 7
    static void randomUntilZero() {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);
    }

    // Задача 8
    static void sumUntilZero() {
        int sum = 0, n;
        System.out.println("Введите числа (0 для завершения):");

        do {
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);

        System.out.println("Сумма: " + sum);
    }

    // Задача 9
    static void passwordCheck() {
        System.out.print("Введите пароль: ");
        String password = scanner.next();

        if (password.length() >= 6)
            System.out.println("Пароль корректен");
        else
            System.out.println("Пароль слишком короткий");
    }

    // Задача 10
    static void findMin() {
        System.out.println("Введите числа (0 для завершения):");
        int n;
        int min = Integer.MAX_VALUE;

        do {
            n = scanner.nextInt();
            if (n != 0 && n < min) min = n;
        } while (n != 0);

        if (min == Integer.MAX_VALUE)
            System.out.println("Нет введённых чисел");
        else
            System.out.println("Минимальное: " + min);
    }
}