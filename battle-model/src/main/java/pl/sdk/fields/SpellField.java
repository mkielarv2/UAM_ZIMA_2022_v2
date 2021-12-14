//package pl.sdk.fields;
//
//import pl.sdk.creatures.Creature;
//
//class SpellField extends EffectField {
//
//    private final Spell spell;
//
//    SpellField(int spell, int turns) {
//        super(SpecialFieldType.SPELL_FIELD, turns);
//        this.spell = spell;
//    }
//
//    @Override
//    protected void triggerEffect(Creature creature) {
//        spell.cast(creature);
//    }
//}
