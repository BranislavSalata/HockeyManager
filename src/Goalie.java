public class Goalie extends Player{
    private int wins;

    public Goalie(int age, String name) {
        this.wins = 0;
        this.age = age;
        this.name = name;
    }


    @Override
    public void adder() {
        this.wins++;
    }
}
