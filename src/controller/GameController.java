package controller;

import model.Player;
import view.ConsoleView;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    private ConsoleView view;
    private List<Player> players;

    public GameController(ConsoleView view) {
        this.view = view;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startMatch() {
        view.displayPlayers(players);
        view.displayMatchStart();
    }
}
