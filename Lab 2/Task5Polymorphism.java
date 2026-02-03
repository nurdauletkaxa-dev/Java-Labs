public class Task5Polymorphism {

    public static void run() {
        FootballTeam team = new Barcelona(); // ссылка на базовый класс, но объект производного
        team.displayInfo();
    }
}