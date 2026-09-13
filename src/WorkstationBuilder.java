/**
 * Declares the fluent steps used to construct a workstation.
 */
public interface WorkstationBuilder {

    WorkstationBuilder withProcessor(String processor);

    WorkstationBuilder withGraphicsCard(String graphicsCard);

    WorkstationBuilder withMemoryGb(int memoryGb);

    WorkstationBuilder withStorageGb(int storageGb);

    WorkstationBuilder withMonitor(String monitor);

    WorkstationBuilder withOperatingSystem(String operatingSystem);

    WorkstationBuilder addAccessory(String accessory);

    Workstation build();
}
