package service;


public class BattleResult {

    public int numberRemainingInA = 0;

    public int numberRemainingInB = 0;

    public boolean didArmyAWin = false;

    BattleResult(int numberRemainingInA, int numberRemainingInB, boolean didArmyAWin) {
        this.numberRemainingInA = numberRemainingInA;
        this.numberRemainingInB = numberRemainingInB;
        this.didArmyAWin = didArmyAWin;
    }

}
