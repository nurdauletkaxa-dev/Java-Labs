// Пример 5
// Проверить, является ли введённое число
// чётным или нечётным

import java.util.Scanner;

public class Example5_EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        scanner.close();

    }
}
