// Пример 9
// Определить, попадает ли число
// в диапазон от 10 до 50

import java.util.Scanner;

public class Example9_RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 50) {
            System.out.println("Число в диапазоне 10–50");
        } else {
            System.out.println("Число вне диапазона");
        }
        scanner.close();

    }
}
