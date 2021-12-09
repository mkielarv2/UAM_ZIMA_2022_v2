package pl.sdk.artifact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdk.artifacts.EconomyArtifact;
import pl.sdk.artifacts.EconomyArtifactFactory;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtifactTest {
    private Creature creature;
    private EconomyArtifactFactory economyArtifactFactory;
    private ArtifactFactory artifactFactory;

    @BeforeEach
    void init(){
        creature = NecropolisFactory.createDefaultForTests();
        economyArtifactFactory = new EconomyArtifactFactory();
        artifactFactory = new ArtifactFactory();
    }

    @Test
    void shouldHave5MoreMaxAndCurrentHp(){
        creature.stats = new CreatureStatisticHpDecorator(creature.stats, 5);
        // cant get maxHp for Creature instance
        assertEquals(15, creature.getMaxHp());
        // Can't adjust current hp for Creature instance
        assertEquals(15, creature.getCurrentHp());
    }

    @Test
    void shouldHave1MoreMaxAndCurrentHp(){
        EconomyArtifact artifact = economyArtifactFactory.create("Ring of Vitality");
        creature.stats = artifactFactory.create(creature.stats, artifact.getName());
        assertEquals(11, creature.getMaxHp());
        // Can't adjust current hp for Creature instance
        assertEquals(15, creature.getCurrentHp());
    }

    @Test
    void shouldHave2MoreMaxAndCurrentHp(){
        EconomyArtifact artifact = economyArtifactFactory.create("Vial of Lifeblood");
        creature.stats = artifactFactory.create(creature.stats, artifact.getName());
        assertEquals(12, creature.getMaxHp());
        // Can't adjust current hp for Creature instance
        assertEquals(15, creature.getCurrentHp());
    }
}
