package pl.sdk;

import org.junit.jupiter.api.Test;
import pl.sdk.creatures.*;

import static org.junit.jupiter.api.Assertions.*;

public class FractionFactoryTest {

    @Test
    public void ShouldCreateFractionInstanceCorrectly() {
        FractionFactory test = new FractionFactory();
        AbstractCreatureFactory factory = test.getInstance(Fractions.CASTLE);

        assertTrue(factory instanceof CastleFactory);
    }

    @Test
    public void ShouldNotCreateOtherFractionInstance() {
        FractionFactory test = new FractionFactory();
        AbstractCreatureFactory factory = test.getInstance(Fractions.CASTLE);

        assertFalse(factory instanceof DungeonFactory);
        assertFalse(factory instanceof NecropolisFactory);
    }
}
