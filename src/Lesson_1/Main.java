package Lesson_1;

public class Main {

    public static void main(String[] args) {


Team team1 = new Team("Орлы",
        "Maksim", 1000,
        "Slava", 1000,
        "Alex", 600,
        "Serg", 1000
        );

Course course1 = new Course(800);

        System.out.println(team1.infoTeam());
        course1.doIt(team1);
        team1.showResults();

    }
}
