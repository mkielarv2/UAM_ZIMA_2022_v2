package pl.sdk.spells;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;
import static org.junit.jupiter.api.Assertions.*;

class DamageSpellsTest {
    private Creature defender;
    private NecropolisFactory creatureFactory;

    @BeforeEach
    void init() {
        creatureFactory = new NecropolisFactory();
        defender = creatureFactory.create(false,7,1);
    }

    @Test
    void creatureShouldLost30HpFromIceBoltIfHeroHas1Power() {
        Spell iceBolt = SpellFactory.getSpell(Spells.ICE_BOLT);

        hero.cast(iceBolt).onCreature(defender);

        assertEquals(120,defender.getCurrentHp());
    }

    @Test
    void creatureShouldLost20HpFromMagicArrowIfHeroHas1Power() {
        Spell magicArrow = SpellFactory.getSpell(Spells.MAGIC_ARROW);

        hero.cast(magicArrow).onCreature(defender);

        assertEquals(130,defender.getCurrentHp());
    }

    @Test
    void creatureShouldLost35HpFromLightBoltIfHeroHas1Power(){
        Spell iceBolt = SpellFactory.getSpell(Spells.ICE_BOLT);

        hero.cast(iceBolt).onCreature(defender);

        assertEquals(120,defender.getCurrentHp());
    }
}
