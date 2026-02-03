import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод температуры в Цельсиях
        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        // Перевод в Фаренгейт
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Вывод результата
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        // Закрываем Scanner
        scanner.close();
    }
}
