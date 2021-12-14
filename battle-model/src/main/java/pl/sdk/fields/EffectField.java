package pl.sdk.fields;

import pl.sdk.creatures.Creature;

abstract class EffectField extends SpecialField {

    protected EffectField(SpecialFieldType type, int turns) {
        super(type, turns);
    }

    @Override
    protected abstract void triggerEffect(Creature creature);
}
