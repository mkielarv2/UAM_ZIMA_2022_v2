package pl.sdk.hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroFactoryTest {
    @Test
    void shouldCreateHero() {
        HeroFactory heroFactory = new HeroFactory();

        EconomyHero hero = heroFactory.createHero(HeroStats.Adela);


    }
}