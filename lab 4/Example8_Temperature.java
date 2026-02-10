// Пример 8
// По значению температуры
// определить её состояние

import java.util.Scanner;

public class Example8_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру: ");
        int temp = scanner.nextInt();

        if (temp < 10) {
            System.out.println("Холодно");
        } else if (temp <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
        scanner.close();

    }
}
