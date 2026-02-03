public class Task3Scope {

    int totalGoals = 5; // поле класса - общее количество голов в турнире

    void show() {
        int matchGoals = 3; // локальная переменная - голы в одном матче

        System.out.println("Общее количество голов: " + totalGoals);
        System.out.println("Голы в этом матче: " + matchGoals);
    }

    public static void run() {
        Task3Scope obj = new Task3Scope();
        obj.show();
    }
}

class FootballPlayer {
    String name;
    int age;
}

class Striker extends FootballPlayer {
    int goalsScored; // количество голов, забитых игроком

    void displayInfo() {
        System.out.println("Игрок: " + name + ", Возраст: " + age + ", Забито голов: " + goalsScored);
    }
}
