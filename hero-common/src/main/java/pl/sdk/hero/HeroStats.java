package pl.sdk.hero;

enum HeroStats implements HeroStatsIf{
    Edric("Edric", 2,2,1,1,0,0),
    Orrin("Orrin", 2,2,1,1,0,0),
    Adela("Adela",1,0,2,2,0,0),
    Ingham("Ingham",1,0,2,2,0,0),
    Arlach("Arlach", 2,2,1,1,0,0),
    Lorelei("Lorelei", 2,2,1,1,0,0),
    Alamar("Alamar",0,0,3,2,0,0),
    Jeddite("Jeddite",0,0,3,2,0,0),
    Clavius("Clavius",1,2,2,1,0,0),
    Straker("Straker",1,2,2,1,0,0),
    Nagash("Nagash",1,0,2,2,0,0),
    Septienna("Septienna",1,0,2,2,0,0);

    private final String name;
    private final int attack;
    private final int defense;
    private final int spellPower;
    private final int knowledge;
    private final int morale;
    private final int luck;

    HeroStats(String name, int attack, int defense, int spellPower, int knowledge, int morale, int luck) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.spellPower = spellPower;
        this.knowledge = knowledge;
        this.morale = morale;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getMorale() {
        return morale;
    }

    public int getLuck() {
        return luck;
    }
}
