import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        
        scanner.close();
    }
}
