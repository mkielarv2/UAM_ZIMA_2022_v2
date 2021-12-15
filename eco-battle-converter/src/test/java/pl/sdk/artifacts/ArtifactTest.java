package pl.sdk.artifacts;

import com.google.common.collect.Range;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.CreatureStatisticIf;
import pl.sdk.creatures.CreatureStatisticModifier;
import pl.sdk.creatures.NecropolisFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtifactTest {
    private ArtifactFactory artifactFactory;
    private NecropolisFactory necropolisFactory;

    @BeforeEach
    void init(){
        artifactFactory = new ArtifactFactory();
        necropolisFactory = new NecropolisFactory();
    }

    @Test
    void shouldHave1MoreHp() {
        Creature defaultCreature = necropolisFactory.create(false, 1, 1);
        CreatureStatisticIf modifier = artifactFactory.create(ArtifactInfo.RING_OF_VITALITY.getTranslatedName());
        necropolisFactory.addModifier(modifier);

        Creature modifiedCreature = necropolisFactory.create(false, 1, 1);

        assertEquals(defaultCreature.getCurrentHp() + 1, modifiedCreature.getCurrentHp());
    }

    @Test
    void shouldApplyBothModifiers() {
        Creature defaultCreature = necropolisFactory.create(false, 2, 1);
        CreatureStatisticIf modifier1 = artifactFactory.create(ArtifactInfo.RING_OF_VITALITY.getTranslatedName());
        CreatureStatisticIf modifier2 = artifactFactory.create(ArtifactInfo.VIAL_OF_LIFEBLOOD.getTranslatedName());

        necropolisFactory.addModifier(modifier1);
        necropolisFactory.addModifier(modifier2);

        Creature creature = necropolisFactory.create(false, 2, 1);

        assertEquals(defaultCreature.getCurrentHp() + 3, creature.getCurrentHp());
    }
}
