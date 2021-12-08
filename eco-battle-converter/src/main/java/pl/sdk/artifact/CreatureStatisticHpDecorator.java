package pl.sdk.artifact;

import com.google.common.collect.Range;
import pl.sdk.creatures.CreatureStatisticIf;

class CreatureStatisticHpDecorator implements CreatureStatisticIf {
    private final CreatureStatisticIf decorated;
    private final int hpModifier;

    public CreatureStatisticHpDecorator(CreatureStatisticIf aDecorated, int aHpModifier) {
        decorated = aDecorated;
        hpModifier = aHpModifier;
    }

    @Override
    public String getTranslatedName() {
        return decorated.getTranslatedName();
    }

    @Override
    public int getAttack() {
        return decorated.getAttack();
    }

    @Override
    public int getArmor() {
        return decorated.getArmor();
    }

    @Override
    public int getMaxHp() {
        return decorated.getMaxHp() + hpModifier;
    }

    @Override
    public int getMoveRange() {
        return decorated.getMoveRange();
    }

    @Override
    public Range<Integer> getDamage() {
        return decorated.getDamage();
    }

    @Override
    public int getTier() {
        return decorated.getTier();
    }

    @Override
    public String getDescription() {
        return decorated.getDescription();
    }
}
