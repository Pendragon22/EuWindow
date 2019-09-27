package service;

public class BattleSimulator {

    public static void main(String[] args) {
        EuDialog dialogWindow = new EuDialog();
        dialogWindow.open();
    }

    public BattleResult conductBattle(Army army1, Army army2, boolean isSingleRoundBattle) {

        while (!isBattleEnded(army1, army2)) {
            int numberOfHitsFromArmy1 = army1.attack();
            int numberOfHitsFromArmy2 = army2.attack();

            army1.takeLosses(numberOfHitsFromArmy2);
            army2.takeLosses(numberOfHitsFromArmy1);

            if (isSingleRoundBattle) {
                break;
            }
        }
        return createBattleResults(army1, army2);
    }

    private BattleResult createBattleResults(Army army1, Army army2) {
        boolean army1Victory = false;
        if (army2.isDead()) {
            army1Victory = true;
        }
        return new BattleResult(army1.getRemainingTroopCount(), army2.getRemainingTroopCount(), army1Victory);
    }

    private boolean isBattleEnded(Army army1, Army army2) {
        return army1.isDead() || army2.isDead();
    }



}
