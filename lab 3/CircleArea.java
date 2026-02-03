import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод радиуса
        System.out.print("Введите радиус круга: ");
        double r = scanner.nextDouble();

        // Вычисление площади круга
        double area = 3.14 * r * r;

        // Вывод результата
        System.out.println("Площадь круга: " + area);

        // Закрываем Scanner
        scanner.close();
    }
}
