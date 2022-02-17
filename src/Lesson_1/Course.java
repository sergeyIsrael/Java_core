package Lesson_1;

//❗️ СДЕЛАТЬ МАССИВ ПРЕПЯДСТВИЙ

// ПОЛОСА ПРЕПЯДСТВИЙ
public class Course {

    private int runDistance; // Длинна забега
// private int swimDistance; // Длинна заплыва

    public Course (int runMeters) {
        this.runDistance = runMeters;
    }

//    ЗАБЕГ
    public void run(Player teamPlayer) {
        boolean result = runDistance <= teamPlayer.getRunLimit();
//        String message = result ? "Прошёл дистанцию!🤩" : "НЕ смог пройти дистанцию.";
        teamPlayer.setResult(result);
//        System.out.println(teamPlayer.getName() + " " + message );
    }

//    забег v2
    //    public void run(Player teamPlayer) {
//        if (runDistance <= teamPlayer.getRunLimit()) {
//            teamPlayer.setResult(true);
//            System.out.println( teamPlayer.getName() + " Прошёл дистанцию!🤩 ");
//        } else {
//            teamPlayer.setResult(false);
//            System.out.println(teamPlayer.getName() + " НЕ смог пройти дистанцию. ");
//        }
//    }

//    забег v3
//    public void run(Player teamPlayer) {
//        boolean result = false;
//        String message = "НЕ смог пройти дистанцию.";
//        if (runDistance <= teamPlayer.getRunLimit()) {
//            message = "Прошёл дистанцию!🤩";
//            result = true;
//        }
//        teamPlayer.setResult(result);
//        System.out.println(teamPlayer.getName() + " " + message );
//    }




//    DO IT - пройти все препядствия (пока только одно)
    public void doIt (Team team) {
        for (Player teamPlayer : team.getPlayers()) {
            run(teamPlayer);
        }
   }

    public int getRunDistance() {
        return runDistance;
    }


}


