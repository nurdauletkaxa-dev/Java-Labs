import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}