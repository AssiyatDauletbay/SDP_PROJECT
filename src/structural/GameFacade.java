package structural;

import controller.GameController;
import creational.PlayerFactory;
import model.Player;
import view.ConsoleView;

public class GameFacade {
    private GameController gameController;
    private ConsoleView view;

    public GameFacade() {
        this.view = new ConsoleView();
        this.gameController = new GameController(view);
    }

    public void setupMatch() {
        Player player1 = PlayerFactory.createPlayer("Messi", "Forward");
        Player player2 = PlayerFactory.createPlayer("Allison", "Goalkeeper");
        gameController.addPlayer(player1);
        gameController.addPlayer(player2);
    }

    public void startMatch() {
        gameController.startMatch();
    }
}
