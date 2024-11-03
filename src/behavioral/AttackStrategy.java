package behavioral;

public class AttackStrategy implements PlayStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Team is in attack mode!");
    }
}
