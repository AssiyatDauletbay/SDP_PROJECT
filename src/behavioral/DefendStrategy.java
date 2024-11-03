package behavioral;

public class DefendStrategy implements PlayStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Team is in defend mode!");
    }
}

