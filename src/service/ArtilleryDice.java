package service;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArtilleryDice implements BattleDice {

    private List<DiceResult> rollPossiblities = Arrays.asList(DiceResult.INFANTRY_SYMBOL, DiceResult.INFANTRY_SYMBOL,
                                                              DiceResult.DOUBLE_INFANTRY_SYMBOL, DiceResult.ARTILLERY_SYMBOL,
                                                              DiceResult.ARTILLERY_SYMBOL, DiceResult.ARTILLERY_SYMBOL);

    @Override
    public DiceResult roll() {
        Random rand = new Random();
        return rollPossiblities.get(rand.nextInt(rollPossiblities.size()));
    }
}
