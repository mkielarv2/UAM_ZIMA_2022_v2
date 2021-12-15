package pl.sdk.artifacts;

import pl.sdk.creatures.CreatureStatisticIf;
import pl.sdk.creatures.CreatureStatisticModifier;


class ArtifactFactory {
    CreatureStatisticIf create(String aName) {
        if(ArtifactInfo.RING_OF_VITALITY.getTranslatedName().equals(aName))
            return new CreatureStatisticModifier.Builder().maxHp(1).build();
        if(ArtifactInfo.VIAL_OF_LIFEBLOOD.getTranslatedName().equals(aName))
            return new CreatureStatisticModifier.Builder().maxHp(2).build();

        return new CreatureStatisticModifier.Builder().build();
    }
}
