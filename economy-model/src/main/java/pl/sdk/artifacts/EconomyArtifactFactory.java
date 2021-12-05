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

            default:
                throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }
}
