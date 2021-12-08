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
    void creatureShouldTake30HpFromIceBoltIfHeroHas1Power() {
        Spell iceBolt = SpellFabric.getSpell(Spells.ICE_BOLT);

        hero.cast(iceBolt).onCreature(defender);

        assertEquals(120,defender.getCurrentHp());
    }

    @Test
    void creatureShouldTake20HpFromMagicArrowIfHeroHas1Power() {
        Spell magicArrow = SpellFabric.getSpell(Spells.MAGIC_ARROW);

        hero.cast(magicArrow).onCreature(defender);

        assertEquals(130,defender.getCurrentHp());
    }

    @Test
    void creatureShouldTake35HpFroMightBoltIfHeroHas1Power(){
        Spell iceBolt = SpellFabric.getSpell(Spells.ICE_BOLT);

        hero.cast(iceBolt).onCreature(defender);

        assertEquals(120,defender.getCurrentHp());
    }
}
