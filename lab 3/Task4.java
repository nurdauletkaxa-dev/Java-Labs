import java.util.Scanner;

// Task4.java
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        int square = num * num;  // Вычисление квадрата числа

        System.out.println("Квадрат числа " + num + " равен: " + square);

        // Закрываем Scanner, чтобы избежать утечек ресурсов
        scanner.close();
    }
}
