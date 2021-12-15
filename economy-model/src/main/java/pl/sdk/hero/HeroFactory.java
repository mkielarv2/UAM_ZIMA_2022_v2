package pl.sdk.hero;

public class HeroFactory {
    public EconomyHero createHero(HeroStats heroStats) {
        switch (heroStats) {
            case Edric:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Edric");
            case Orrin:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Orrin");
            case Adela:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Adela");
            case Ingham:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Ingham");
            case Arlach:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Arlach");
            case Lorelei:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Lorelei");
            case Alamar:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Alamar");
            case Jeddite:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Jeddite");
            case Clavius:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Clavius");
            case Straker:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Straker");
            case Nagash:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Nagash");
            case Septienna:
                return new EconomyHero(EconomyHero.Fraction.NECROPOLIS, heroStats, 0, "Septienna");
        }
    }
}
