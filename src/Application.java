/**
 * Client code that demonstrates two standard and one custom workstation.
 */
public final class Application {

    private Application() {
    }

    public static void main(String[] args) {
        WorkstationDirector director = new WorkstationDirector();

        Workstation gamingWorkstation = director.createStandardGamingWorkstation(
                new GamingWorkstationBuilder());
        Workstation officeWorkstation = director.createStandardOfficeWorkstation(
                new OfficeWorkstationBuilder());
        Workstation customGamingWorkstation = new GamingWorkstationBuilder()
                .withProcessor("AMD Ryzen 9 7900X")
                .withGraphicsCard("NVIDIA GeForce RTX 4080 SUPER")
                .withMemoryGb(64)
                .withStorageGb(4000)
                .withMonitor("32-inch 4K 144 Hz monitor")
                .withOperatingSystem("Windows 11 Pro")
                .addAccessory("Streaming microphone")
                .build();

        printWorkstation("Gaming workstation", gamingWorkstation);
        printWorkstation("Office workstation", officeWorkstation);
        printWorkstation("Custom gaming workstation", customGamingWorkstation);
    }

    private static void printWorkstation(String title, Workstation workstation) {
        System.out.println(title);
        System.out.println(workstation);
        System.out.println();
    }
}
