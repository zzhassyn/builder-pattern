/**
 * Builds a productivity-oriented workstation with office defaults.
 */
public final class OfficeWorkstationBuilder extends AbstractWorkstationBuilder {

    public OfficeWorkstationBuilder() {
        withProcessor("Intel Core i5-14500");
        withGraphicsCard("Integrated graphics");
        withMemoryGb(16);
        withStorageGb(1000);
        withMonitor("24-inch IPS monitor");
        withOperatingSystem("Windows 11 Pro");
        addAccessory("Wireless keyboard");
        addAccessory("Ergonomic mouse");
        addAccessory("1080p webcam");
    }
}
