import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите радиус круга: ");
        double r = scanner.nextDouble();

        
        double area = 3.14 * r * r;

        
        System.out.println("Площадь круга: " + area);

        
        scanner.close();
    }
}
