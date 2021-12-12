package pl.sdk.creatures;

public class FractionFactory {
    final static String EXCEPTION_MESSAGE = "Fraction doesn't exist!";

    public AbstractCreatureFactory makeFraction(Fractions aFraction) {
        if (aFraction.equals(Fractions.CASTLE)) {
            return new CastleFactory();
        } else if (aFraction.equals(Fractions.DUNGEON)) {
            return new DungeonFactory();
        } else if (aFraction.equals(Fractions.NECROPOLIS)) {
            return new NecropolisFactory();
        }
        throw new IllegalArgumentException(EXCEPTION_MESSAGE);
    }
}
