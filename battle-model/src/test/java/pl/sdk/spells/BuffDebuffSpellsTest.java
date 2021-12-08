package pl.sdk.spells;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;
import static org.junit.jupiter.api.Assertions.*;

class BuffDebuffSpellsTest {
    private Creature targetedCreature;
    private NecropolisFactory creatureFactory;

    @BeforeEach
    void init() {
        creatureFactory = new NecropolisFactory();
        targetedCreature = creatureFactory.create(false,1,1);
    }

    @Test
    void creatureShouldHave7MoveRange() {
        Spell haste = SpellFabric.getSpell(Spells.HASTE);

        hero.cast(haste).onCreature(targetedCreature);

        assertEquals(7,targetedCreature.getMoveRange());
    }

    @Test
    void creatureShouldHave3MoveRange() {
        Spell slow = SpellFabric.getSpell(Spells.SLOW);

        hero.cast(slow).onCreature(targetedCreature);

        assertEquals(3,targetedCreature.getMoveRange());
    }

    @Test
    void creatureShouldHave8Attack() {
        Spell bloodlust = SpellFabric.getSpell(Spells.BLOODLUST);

        hero.cast(bloodlust).onCreature(targetedCreature);

        assertEquals(8,targetedCreature.getAttack());
    }
}
