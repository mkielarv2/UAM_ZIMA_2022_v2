package pl.sdk.hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroFactoryTest {
    @Test
    void shouldCreateHero() {
        //given
        HeroFactory heroFactory = new HeroFactory();

        //when
        EconomyHero hero = heroFactory.createHero(HeroStats.Adela);

        //then
        HeroStats stats = hero.getStats();
        assertEquals(stats.getAttack(), 1);
        assertEquals(stats.getDefense(), 0);
        assertEquals(stats.getSpellPower(), 2);
        assertEquals(stats.getKnowledge(), 2);
        assertEquals(stats.getMorale(), 0);
        assertEquals(stats.getLuck(), 0);
        assertEquals(stats.getName(), "Adela");
    }
}