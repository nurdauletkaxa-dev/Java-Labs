import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите длину прямоугольника: ");
        double a = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double b = scanner.nextDouble();

        
        double area = a * b;
        double perimeter = 2 * (a + b);

        
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);

        
        scanner.close();
    }
}
