import behavioral.AttackStrategy;
import behavioral.Coach;
import behavioral.Observer;
import behavioral.PlayStrategy;
import creational.LeagueManager;
import structural.GameFacade;

public class Main {
    public static void main(String[] args) {
        // Использование Facade
        GameFacade gameFacade = new GameFacade();
        gameFacade.setupMatch();
        gameFacade.startMatch();

        // Использование Singleton
        LeagueManager manager = LeagueManager.getInstance();
        manager.manage();

        // Использование Strategy
        PlayStrategy attack = new AttackStrategy();
        attack.executeStrategy();

        // Использование Observer
        Coach coach = new Coach();
        coach.addObserver(message -> System.out.println("Observer received: " + message));
        coach.notifyObservers("Goal scored!");
    }
}

