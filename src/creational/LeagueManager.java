package creational;

public class LeagueManager {
    private static LeagueManager instance;

    private LeagueManager() {}

    public static LeagueManager getInstance() {
        if (instance == null) {
            instance = new LeagueManager();
        }
        return instance;
    }

    public void manage() {
        System.out.println("Managing the league...");
    }
}
