/**
 * Stores reusable construction recipes for known workstation configurations.
 */
public final class WorkstationDirector {

    public Workstation createStandardGamingWorkstation(WorkstationBuilder builder) {
        return builder.build();
    }

    public Workstation createStandardOfficeWorkstation(WorkstationBuilder builder) {
        return builder.build();
    }
}
