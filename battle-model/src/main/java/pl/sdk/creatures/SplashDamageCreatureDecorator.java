package pl.sdk.creatures;

import java.beans.PropertyChangeEvent;

import com.google.common.collect.Range;

class SplashDamageCreatureDecorator extends Creature {

    private final boolean[][] splashDamageTable;
    private final Creature decorated;

    public SplashDamageCreatureDecorator( final Creature aDecorated, final boolean[][] aSplashDamageTable) {
        decorated = aDecorated;
        splashDamageTable = aSplashDamageTable;
    }

    @Override
    public void attack( final Creature aDefender) {
        decorated.attack(aDefender);
    }

    @Override
    int calculateDamage( final Creature aAttacker, final Creature aDefender) {
        return decorated.calculateDamage(aAttacker, aDefender);
    }

    @Override
    void counterAttack( final Creature aDefender) {
        decorated.counterAttack(aDefender);
    }

    @Override
    public void applyDamage( final int aDamageToApply) {
        decorated.applyDamage(aDamageToApply);
    }

    @Override
    public boolean isAlive() {
        return decorated.isAlive();
    }

    @Override
    public int getCurrentHp() {
        return decorated.getCurrentHp();
    }

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public boolean canCounterAttack() {
        return decorated.canCounterAttack();
    }

    @Override
    public int getMoveRange() {
        return decorated.getMoveRange();
    }

    @Override
    public void propertyChange( final PropertyChangeEvent aPropertyChangeEvent) {
        decorated.propertyChange(aPropertyChangeEvent);
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
    public Range<Integer> getDamage() {
        return decorated.getDamage();
    }

    @Override
    public int getAmount() {
        return decorated.getAmount();
    }

    @Override
    public String currentHealth() {
        return decorated.currentHealth();
    }

    @Override
    public String toString() {
        return decorated.toString();
    }

    @Override
    public double getAttackRange() {
        return decorated.getAttackRange();
    }

    @Override
    void setCurrentHpToMaximum() {
        decorated.setCurrentHpToMaximum();
    }

    @Override
    public boolean[][] getSplashRange() {
        return splashDamageTable;
    }
}
