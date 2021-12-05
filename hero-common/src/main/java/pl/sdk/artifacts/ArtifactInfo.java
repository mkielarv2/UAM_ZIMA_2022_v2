package pl.sdk.artifacts;

enum ArtifactInfo implements ArtifactInfoIf {

    ORB_OF_THE_FIRMAMENT("Orb of the Firmament", "Hero's air spells to extra 50% damage", ArtifactSlotType.MISC),
    ORB_OF_SLIT("Orb of Slit", "Hero's earth spells to extra 50% damage", ArtifactSlotType.MISC),
    ORB_OF_TEMPESTUOUS_FIRE("Orb of Tempestuous Fire", "Hero's fire spells to extra 50% damage", ArtifactSlotType.MISC),
    ORB_OF_DRIVING_RAIN("Orb of Driving Rain", "Hero's water spells to extra 50% damage", ArtifactSlotType.MISC);



    private final String name;
    private final String description;
    private final ArtifactSlotType slot;

    ArtifactInfo (String aName, String aDescription, ArtifactSlotType aSlot) {
        name = aName;
        description = aDescription;
        slot = aSlot;
    }

    public String getTranslatedName() {
        return name;
    }

    public String getDescription() { return description; }

    public ArtifactSlotType getSlot() { return slot; }

}
