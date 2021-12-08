package pl.sdk.artifact;

import pl.sdk.creatures.CreatureStatisticIf;

class ArtifactFactory {
    CreatureStatisticIf create(CreatureStatisticIf aStats, String aName) {
        switch(aName) {
            case "Ring of Vitality":
                return new CreatureStatisticHpDecorator(aStats, 1);
            case "Vial of Lifeblood":
                return new CreatureStatisticHpDecorator(aStats, 2);
            default:
                return aStats;
        }
    }
}
