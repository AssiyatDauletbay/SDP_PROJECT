package structural;

import model.Player;

public class PlayerAdapter {
    private Player player;

    public PlayerAdapter(Player player) {
        this.player = player;
    }

    public String getPlayerDetails() {
        return "Name: " + player.getName() + ", Position: " + player.getPosition();
    }
}
