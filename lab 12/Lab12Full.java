import java.util.*;

public class Lab12Full {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // 1. Длина строки
        System.out.println("1. Длина строки: " + input.length());

        // 2. Изменение регистра
        System.out.println("2. Верхний регистр: " + input.toUpperCase());
        System.out.println("   Нижний регистр: " + input.toLowerCase());

        // 3. Подсчёт слов
        String[] words = input.trim().split("\\s+");
        System.out.println("3. Количество слов: " + words.length);

        // 4. Обратный порядок слов (каждое слово)
        System.out.print("4. Слова наоборот: ");
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.print(reversedWord + " ");
        }
        System.out.println();

        // 5. Поиск слова
        System.out.print("5. Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        System.out.println("   Найдено: " + input.contains(searchWord));

        // 6. Замена слова
        System.out.print("6. Что заменить: ");
        String oldWord = scanner.nextLine();
        System.out.print("   На что заменить: ");
        String newWord = scanner.nextLine();
        System.out.println("   Результат: " + input.replace(oldWord, newWord));

        // 7. Проверка палиндрома
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println("7. Палиндром: " + cleaned.equals(reversed));

        // 8. Сравнение строк
        System.out.print("8. Введите строку для сравнения: ");
        String another = scanner.nextLine();
        System.out.println("   Равны: " + input.equals(another));

        // 9. Разделение строки
        System.out.print("9. Введите разделитель: ");
        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        System.out.println("   Части строки:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 10. Гласные и согласные
        int vowels = 0, consonants = 0;
        String vowelsStr = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsStr.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("10. Гласные: " + vowels + ", Согласные: " + consonants);

        // 11. Удалить пробелы
        System.out.println("11. Без пробелов: " + input.replace(" ", ""));

        // 12. Самое длинное слово
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("12. Самое длинное слово: " + longest);

        // 13. Символы без пробелов
        System.out.println("13. Символов без пробелов: " + input.replace(" ", "").length());

        // 14. startsWith
        System.out.print("14. Введите начало: ");
        String start = scanner.nextLine();
        System.out.println("   Начинается с: " + input.startsWith(start));

        // 15. endsWith
        System.out.print("15. Введите окончание: ");
        String end = scanner.nextLine();
        System.out.println("   Заканчивается на: " + input.endsWith(end));

        // 16. Полный реверс строки
        System.out.println("16. Строка наоборот: " + new StringBuilder(input).reverse());

        // 17. Удалить цифры
        System.out.println("17. Без цифр: " + input.replaceAll("\\d", ""));

        // 18. Заменить гласные на *
        String replacedVowels = input.replaceAll("[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]", "*");
        System.out.println("18. Гласные заменены: " + replacedVowels);

        // 19. Частота символов
        System.out.println("19. Частота символов:");
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 20. Только цифры?
        System.out.println("20. Только цифры: " + input.matches("\\d+"));

        scanner.close();
    }
}