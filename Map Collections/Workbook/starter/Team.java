import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name=name;
        this.players=new HashMap<>();
    }
    
    public String getName() {
        String name1=this.name;
        return name1;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getPlayer(String position) {
        String pos=this.players.get(position);
        return pos;
    }

    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }    

    
}
