package pl.sdk.artifacts;

import pl.sdk.creatures.Creature;

import java.util.ArrayList;
import java.util.List;

public class ArtifactApplier {
    private final ArtifactFactory artifactFactory;

    private ArtifactApplier() {
        artifactFactory = new ArtifactFactory();
    }

    public List<Creature> applyArtifacts(List<Creature> aCreatures, List<EconomyArtifact> aArtifacts) {
        List<Creature> modifiedCreatures = new ArrayList<>();

        for(Creature creature : aCreatures){
            // need a way to copy a creature and set its stats
            // Creature modifiedCreature = creature.copy()

            for(EconomyArtifact artifact: aArtifacts) {
                // modifiedCreature.stats = artifactFactory.create(modifiedCreatures.stats, artifact.getName());
            }

           // modifiedCreatures.add(modifiedCreature);
        }

        return modifiedCreatures;
    }
}
