public class Main {
    public static void main(String[] args) {
        HockeyManager manager = new HockeyManager();
        manager.AddNewDefender(12, "Peter");
        manager.AddNewDefender(13, "Jakub");
        manager.AddNewGoalie(25, "Stevo");
        manager.AddNewForward(11, "Seb");
        manager.PrintNameAndAgeOfTheYoungestPlayer();
    }
}