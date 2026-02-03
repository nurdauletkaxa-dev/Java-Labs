import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод скорости и времени
        System.out.print("Введите скорость (м/с): ");
        double velocity = scanner.nextDouble();
        System.out.print("Введите время (секунды): ");
        double time = scanner.nextDouble();

        // Вычисление расстояния
        double distance = velocity * time;

        // Вывод результата
        System.out.println("Пройденное расстояние: " + distance + " метров");

        // Закрываем Scanner
        scanner.close();
    }
}
