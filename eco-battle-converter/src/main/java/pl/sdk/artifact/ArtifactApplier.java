package pl.sdk.artifact;

import com.google.common.collect.Range;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import pl.sdk.artifacts.EconomyArtifact;
import pl.sdk.creatures.Creature;

import java.util.ArrayList;
import java.util.List;

public class ArtifactApplier {
    private final ArtifactFactory artifactFactory;

    private ArtifactApplier() {
        artifactFactory = new ArtifactFactory();
    }

    public List<Creature> applyArtifacts(List<Creature> creatures, List<EconomyArtifact> artifacts) {
        List<Creature> modifiedCreatures = new ArrayList<>();

        for(Creature creature : creatures){
            for(EconomyArtifact artifact: artifacts) {
                // need a way to copy a creature and set its stats
                // Creature modifiedCreature = creature.copy()

                modifiedCreature.stats = artifactFactory.create(modifiedCreatures.stats, artifact.getName());
                modifiedCreatures.add(modifiedCreature);
            }
        }

        return modifiedCreatures;
    }
}
