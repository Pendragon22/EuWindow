

public class Army {

    private General general;

    public boolean isBotArmy;

    private int infantryCount;

    private int cavalryCount;

    private int artilleryCount;

	private boolean hasTercios;

	private boolean hasNobleKnights;

	private boolean hasMilitaryDrill;

    public boolean isDead() {
        return infantryCount <= 0 && cavalryCount <= 0 && artilleryCount <= 0;
    }

    public Army(boolean isBotArmy, General general, int infantryCount, int cavalryCount, int artilleryCount, boolean ifTercios, boolean ifNobleKnights, boolean ifMilitaryDrill) {
        this.isBotArmy = isBotArmy;
        this.general = general;
        this.infantryCount = infantryCount;
        this.cavalryCount = cavalryCount;
        this.artilleryCount = artilleryCount;
        this.hasTercios = ifTercios;
        this.hasNobleKnights = ifNobleKnights;
        this.hasMilitaryDrill = ifMilitaryDrill;
        if (isBotArmy) {
            this.general = new General(2, 0, 0);
        }
    }

    int attack() {
        int numberOfInfHits = 0, numberOfCavHits = 0, numberOfArtHits = 0;
        for (int i = 0 ; i < 3 + this.general.numberOfInfantryDice ; i++) {
            InfantryDice infantryDice = new InfantryDice();
            DiceResult infantryDiceResult = infantryDice.roll();
            if (DiceResult.INFANTRY_SYMBOL == infantryDiceResult || DiceResult.DOUBLE_INFANTRY_SYMBOL == infantryDiceResult){
                numberOfInfHits++;
                if (DiceResult.DOUBLE_INFANTRY_SYMBOL == infantryDiceResult && hasTercios) {
                	numberOfInfHits++;
                }
            }
        }
        if (numberOfInfHits > infantryCount) {
        	numberOfInfHits = infantryCount;
        }
        int numberOfCavRerolls = 0;
        for (int i = 0; i < this.general.numberOfCavalryyDice; i++) {
            CavalryDice cavalryDice = new CavalryDice();
            DiceResult cavalryDiceResult = cavalryDice.roll();
            if (DiceResult.CAVALRY_SYMBOL == cavalryDiceResult){
                numberOfCavHits++;
            }
            if (DiceResult.DOUBLE_INFANTRY_SYMBOL == cavalryDiceResult){
                numberOfInfHits++;
            }
        }
        for (int i = 0; i < this.general.numberOfArtilleryDice; i++) {
            ArtilleryDice artilleryDice = new ArtilleryDice();
            DiceResult artilleryDiceResult = artilleryDice.roll();
            if (DiceResult.ARTILLERY_SYMBOL == artilleryDiceResult){
                numberOfArtHits++;
            }
            if (DiceResult.DOUBLE_INFANTRY_SYMBOL == artilleryDiceResult){
                numberOfInfHits++;
            }
        }



        return numberOfInfHits + numberOfCavHits + numberOfArtHits;
    }

    public int getRemainingTroopCount() {
        return infantryCount + cavalryCount + artilleryCount;
    }

    void takeLosses(int numberOfHitsToTake) {
        if (getRemainingTroopCount() != 0) {
            while (numberOfHitsToTake > 0) {
                if ((infantryCount > cavalryCount) && (infantryCount > artilleryCount)) {
                    infantryCount--;
                    numberOfHitsToTake--;
                } else if ((cavalryCount > infantryCount) && (cavalryCount > artilleryCount)) {
                    cavalryCount--;
                    numberOfHitsToTake--;
                } else if ((artilleryCount > infantryCount) && (artilleryCount > cavalryCount)) {
                    artilleryCount--;
                    numberOfHitsToTake--;
                } else {
                    if (infantryCount != 0) {
                        infantryCount--;
                        numberOfHitsToTake--;
                    } else if (cavalryCount != 0) {
                        cavalryCount--;
                        numberOfHitsToTake--;
                    } else if (artilleryCount != 0){
                        artilleryCount--;
                        numberOfHitsToTake--;
                    }
                    numberOfHitsToTake--;
                }
            }
        }
    }
}
