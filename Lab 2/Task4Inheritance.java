public class Task4Inheritance {

    public static void run() {
        Striker striker = new Striker();
        striker.name = "Лионель Месси";
        striker.age = 34;
        striker.goalsScored = 750;

        striker.displayInfo();
    }
}

class FootballTeam {
    void displayInfo() {
        System.out.println("Это футбольная команда");
    }
}

class Barcelona extends FootballTeam {
    @Override
    void displayInfo() {
        System.out.println("Это футбольная команда Барселона");
    }
}
