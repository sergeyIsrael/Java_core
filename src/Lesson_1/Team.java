package Lesson_1;

import java.util.Arrays;

// КОМАНДА
public class Team {
    public int TEAM_SIZE = 4; // кол-во игроков в команде
    private final String nameTeam;
    private final Player[] players; // Массив игроков


    public Team(String nameTeam,
                String namePlayer1, int playerMaxLimit1,
                String namePlayer2, int playerMaxLimit2,
                String namePlayer3, int playerMaxLimit3,
                String namePlayer4, int playerMaxLimit4 ) {

        this.nameTeam = nameTeam;
        this.players = new Player[TEAM_SIZE];

        this.players[0] = new Player(namePlayer1, playerMaxLimit1);
        this.players[1] = new Player(namePlayer2, playerMaxLimit2);
        this.players[2] = new Player(namePlayer3, playerMaxLimit3);
        this.players[3] = new Player(namePlayer4, playerMaxLimit4);
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public Player[] getPlayers() {
        return players;
    }

// Инфа
    public String infoTeam() {
        return " Команда " + nameTeam + ", игроки: " + Arrays.toString(players);
    }

    // Результат
    public void showResults() {
        for (Player teamPlayer : players) {
            if (teamPlayer.isResult() == true) {
                System.out.println(teamPlayer.getName() + " ✅ Прошёл дистанцию!🤩 ");
            } else {
                System.out.println(teamPlayer.getName() + " 💢 НЕ смог пройти дистанцию. ");
            }
        }
    }



}
