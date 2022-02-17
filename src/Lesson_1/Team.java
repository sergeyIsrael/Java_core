package Lesson_1;

import java.util.Arrays;

public class Team {
    private final String nameTeam;
    public int TEAM_SIZE = 4;
    private final Player[] players;


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


    public String infoTeam() {
        return " Команда " + nameTeam + ", игроки: " + Arrays.toString(players);
    }


}
