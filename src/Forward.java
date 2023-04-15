public class Forward extends Player{
    private int goals;

    public Forward(int age, String name) {
        this.goals = 0;
        this.age = age;
        this.name = name;
    }

    @Override
    public void adder() {
        this.goals++;
    }
}
