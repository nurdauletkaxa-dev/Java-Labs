import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        // Вычисление суммы и среднего
        int sum = a + b;
        double average = (a + b) / 2.0;

        // Вывод результатов
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        // Закрываем Scanner
        scanner.close();
    }
}
