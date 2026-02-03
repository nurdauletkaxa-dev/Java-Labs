import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        // Вычисление квадрата и куба
        double square = Math.pow(x, 2);
        double cube = Math.pow(x, 3);

        // Вывод результатов
        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);

        // Закрываем Scanner
        scanner.close();
    }
}
