import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        
        double square = Math.pow(x, 2);
        double cube = Math.pow(x, 3);

        
        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);

        
        scanner.close();
    }
}
