
public class Task1Variables {

    public static void run() {
        int matchDuration = 90;      // продолжительность матча в минутах
        double matchScore = 3.5;     // количество голов в матче (могут быть и неполные)
        boolean isGoalScored = true; // флаг, был ли забит гол

        final String TOURNAMENT_NAME = "Чемпионат мира";

        System.out.println("Продолжительность матча: " + matchDuration + " минут");
        System.out.println("Количество голов в матче: " + matchScore);
        System.out.println("Гол забит: " + isGoalScored);
        System.out.println("Турнир (константа): " + TOURNAMENT_NAME);
    }
}