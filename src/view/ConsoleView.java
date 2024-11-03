package view;

import model.Player;
import java.util.List;

public class ConsoleView {
    public void displayPlayers(List<Player> players) {
        players.forEach(player -> System.out.println("Player: " + player.getName() + ", Position: " + player.getPosition()));
    }

    public void displayMatchStart() {
        System.out.println("The match has started!");
    }
}
