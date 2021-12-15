package pl.sdk.creatures;

import com.google.common.collect.Range;

public class CreatureStatisticModifier implements CreatureStatisticIf {
    private final String translatedName;
    private final int attack;
    private final int armor;
    private final int maxHp;
    private final int moveRange;
    private final Range<Integer> damage;
    private final int tier;
    private final String description;

    // TODO: Builder would be cool
    private CreatureStatisticModifier(String aTranslatedName, int aAttack, int aArmor, int aMaxHp, int aMoveRange, Range<Integer> aDamage, int aTier, String aDescription) {
        translatedName = aTranslatedName;
        attack = aAttack;
        armor = aArmor;
        maxHp = aMaxHp;
        moveRange = aMoveRange;
        damage = aDamage;
        tier = aTier;
        description = aDescription;
    }

    // TODO: consider restraining access
    public static class Builder {
        private int attack = 0;
        private int armor = 0;
        private int maxHp = 0;
        private int moveRange = 0;
        private Range<Integer> damage = Range.closed(0, 0);

        public Builder attack(int aAttack) {
            this.attack = aAttack;
            return this;
        }
        public Builder armor(int aArmor) {
            this.armor = aArmor;
            return this;
        }
        public Builder maxHp(int maxHp) {
            this.maxHp = maxHp;
            return this;
        }
        public Builder moveRange(int aMoveRange) {
            this.moveRange = aMoveRange;
            return this;
        }
        public Builder damage(Range<Integer> aDamage) {
            this.damage = aDamage;
            return this;
        }

        public CreatureStatisticModifier build() {
            return new CreatureStatisticModifier("", this.attack, this.armor, this.maxHp, this.moveRange, this.damage, 0, "");
        }
    }

    public CreatureStatisticModifier addModifier(CreatureStatisticIf aModifier) {
        return new CreatureStatisticModifier(
                aModifier.getTranslatedName(),
                getAttack() + aModifier.getAttack(),
                getArmor() + aModifier.getArmor(),
                getMaxHp() + aModifier.getMaxHp(),
                getMoveRange() + aModifier.getMoveRange(),
                Range.closed(
                        getDamage().lowerEndpoint() + aModifier.getDamage().lowerEndpoint(),
                        getDamage().upperEndpoint() + aModifier.getDamage().upperEndpoint()
                        ),
                aModifier.getTier(),
                aModifier.getDescription()
            );
    }

    @Override
    public String getTranslatedName() {
        return translatedName;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHp() {
        return maxHp;
    }

    @Override
    public int getMoveRange() {
        return moveRange;
    }

    @Override
    public Range<Integer> getDamage() {
        return damage;
    }

    @Override
    public int getTier() {
        return tier;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
