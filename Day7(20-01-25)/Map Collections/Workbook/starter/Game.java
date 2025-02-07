import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {

    private String arena;
    private LocalDate date;


    public Game(String arena) {
        this.arena=new String(arena);
        this.date=LocalDate.now();
    }

    public void begin(Team home, Team away) {
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println
        (
        "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate+"." + 
        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
        "\n - The starting lineup for the home team is: at point guard, " + "<HOME_POINT_GUARD>" + "; at shooting guard, " + "<HOME_SHOOTING_GUARD>" + "; at small forward, " + "<HOME_SMALL_FORWARD>" + "; at power forward, " + "<HOME_POWER_FORWARD>" + "; and at center, " + "<HOME_CENTER>" + ".\n" +
        "\n - The starting lineup for the visiting team is: at point guard, " + "<AWAY_POINT_GUARD>" + "; at shooting guard, " + "<AWAY_SHOOTING_GUARD>" + "; at small forward, " + "<AWAY_SMALL_FORWARD>" + "; at power forward, " + "<AWAY_POWER_FORWARD>" + "; and at center, " + "<AWAY_CENTER>" +".\n" +
        "\n - Let's give a warm round of applause for both teams as they take the court!"
        );
    }

}

    




