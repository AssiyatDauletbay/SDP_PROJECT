package creational;

import model.Player;

public class PlayerFactory {
    public static Player createPlayer(String name, String position) {
        return new Player(name, position);
    }
}
