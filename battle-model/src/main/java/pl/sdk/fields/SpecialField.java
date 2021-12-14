package pl.sdk.fields;

import pl.sdk.creatures.Creature;

public abstract class SpecialField {
    private SpecialFieldType type;
    private int turns;

    public SpecialField(SpecialFieldType type, int turns) {
        this.type = type;
        this.turns = turns;
    }

    public SpecialFieldType getType() {
        return type;
    }

    protected void triggerEffect(Creature creature){}

}
