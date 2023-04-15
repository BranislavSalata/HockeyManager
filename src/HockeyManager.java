import java.util.ArrayList;
public class HockeyManager {
    private ArrayList<Player> players;

    public HockeyManager() {
        this.players = new ArrayList<>();
    }

    public void AddNewForward(int age, String name) {
        this.players.add(new Forward(age, name));
    }
    public void AddNewDefender(int age, String name) {
        this.players.add(new Defender(age, name));
    }
    public void AddNewGoalie(int age, String name) {
        this.players.add(new Goalie(age, name));
    }
    public void PrintNameAndAgeOfTheYoungestPlayer(/*params if needed*/)
    {
        if(players.size() == 0){
            System.out.println("No players");
            return;
        }
        Player player = players.get(0);
        for (Player p : this.players) {
            if (player.age > p.age) {
                player = p;
            }
        }
        System.out.println("Youngest player is " +player.getName() + ": "+ player.getAge()+ " years old.");
    }
}
