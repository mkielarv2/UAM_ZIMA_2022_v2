package pl.sdk.artifacts;

public class EconomyArtifactFactory {

    private static final String EXCEPTION_MESSAGE = "Artifact of such name doesn't exist";

    public EconomyArtifact create(String name) {
        switch(name) {
            case "Orb of the Firmament":
                return new EconomyArtifact(ArtifactInfo.ORB_OF_THE_FIRMAMENT, 6000);
            case "Orb of Slit":
                return new EconomyArtifact(ArtifactInfo.ORB_OF_SLIT, 6000);
            case "Orb of Tempestuous Fire":
                return new EconomyArtifact(ArtifactInfo.ORB_OF_TEMPESTUOUS_FIRE, 6000);
            case "Orb of Driving Rain":
                return new EconomyArtifact(ArtifactInfo.ORB_OF_DRIVING_RAIN, 6000);
            case "Tome of Air Magic":
                return new EconomyArtifact(ArtifactInfo.TOME_OF_AIR_MAGIC, 20000);
            case "Tome of Earth Magic":
                return new EconomyArtifact(ArtifactInfo.TOME_OF_EARTH_MAGIC, 20000);
            case "Tome of Fire Magic":
                return new EconomyArtifact(ArtifactInfo.TOME_OF_FIRE_MAGIC, 20000);
            case "Tome of Water Magic":
                return new EconomyArtifact(ArtifactInfo.TOME_OF_WATER_MAGIC, 20000);
            case "Ring of Vitality":
                return new EconomyArtifact(ArtifactInfo.RING_OF_VITALITY, 5000);
            case "Vial of Lifeblood":
                return new EconomyArtifact(ArtifactInfo.VIAL_OF_LIFEBLOOD, 10000);
            case "Necklace of Swiftness":
                return new EconomyArtifact(ArtifactInfo.NECKLACE_OF_SWIFTNESS, 5000);
            case "Cape of Velocity":
                return new EconomyArtifact(ArtifactInfo.CAPE_OF_VELOCITY, 10000);
            case "Centaur's Axe":
                return new EconomyArtifact(ArtifactInfo.CENTAURS_AXE, 2000);
            case "Titan's Gladius":
                return new EconomyArtifact(ArtifactInfo.TITANS_GLADIUS, 10000);
            case "Shield of the Dwarven Lords":
                return new EconomyArtifact(ArtifactInfo.SHIELD_OF_THE_DWARVEN_LORDS, 2000);
            case "Sentinel's Shield":
                return new EconomyArtifact(ArtifactInfo.SENTINELS_SHIELD, 10000);

            default:
                throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }
}
