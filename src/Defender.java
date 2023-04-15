public class Defender extends Player{
    private int hits;

    public Defender(int age, String name) {
        this.hits = 0;
        this.age = age;
        this.name = name;
    }

    @Override
    public void adder() {
        this.hits++;
    }
}
