import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + grade + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        // Задание 1 — сложение (lambda)
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("1: " + sum.apply(5, 3));

        // Задание 2 — uppercase (Function)
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2: " + toUpper.apply("hello"));

        // Задание 3 — фильтр нечётных (Predicate)
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 4 — квадрат (map)
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 5 — максимум (Comparator)
        int max = numbers.stream()
                .max((a, b) -> a - b)
                .orElse(0);
        System.out.println("5: " + max);

        // Задание 6 — сортировка строк по длине
        List<String> strings = List.of("Java", "Hi", "Stream", "Lambda");
        strings.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);

        // Задание 7 — первая буква заглавная
        strings.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        // Задание 8 — строки длиной > 5
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // Задание 9 — method reference
        numbers.forEach(System.out::println);

        // Задание 10 — Optional (min)
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("10: " + min.orElse(-1));

        // Задание 11 — Consumer
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello Consumer");

        // Задание 12 — Supplier
        Supplier<Double> random = () -> Math.random();
        System.out.println("12: " + random.get());

        // Задание 13 — Comparator.comparing
        List<Student> students = List.of(
                new Student("Alex", 20, 85),
                new Student("Maria", 22, 90),
                new Student("John", 20, 70),
                new Student("Kate", 22, 95)
        );

        students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

        // Задание 14 — объекты
        students.stream()
                .filter(s -> s.getGrade() > 80)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        // Задание 15 — цепочка
        students.stream()
                .filter(s -> s.getGrade() > 80)
                .map(Student::getName)
                .sorted()
                .forEach(System.out::println);

        // Задание 16 — grouping
        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getAge));
        System.out.println("16: " + grouped);

        // Задание 17 — reduce (сумма)
        int total = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("17: " + total);

        // Задание 18 — distinct + limit
        List<Integer> nums = List.of(1,2,2,3,3,4,5);
        nums.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // Задание 19 — flatMap
        List<List<Integer>> listOfLists = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // Задание 20 — заказы
        List<Integer> orders = List.of(500, 1500, 2000, 300, 1200);

        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}