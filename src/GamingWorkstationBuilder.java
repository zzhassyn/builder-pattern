/**
 * Builds a high-performance workstation with gaming-oriented defaults.
 */
public final class GamingWorkstationBuilder extends AbstractWorkstationBuilder {

    public GamingWorkstationBuilder() {
        withProcessor("AMD Ryzen 7 7800X3D");
        withGraphicsCard("NVIDIA GeForce RTX 4070 SUPER");
        withMemoryGb(32);
        withStorageGb(2000);
        withMonitor("27-inch 165 Hz monitor");
        withOperatingSystem("Windows 11 Home");
        addAccessory("Mechanical keyboard");
        addAccessory("Gaming mouse");
        addAccessory("Headset");
    }
}
