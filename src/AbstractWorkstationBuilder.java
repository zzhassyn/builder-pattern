import java.util.ArrayList;
import java.util.List;

/**
 * Contains shared state and validation so concrete builders do not duplicate it.
 */
public abstract class AbstractWorkstationBuilder implements WorkstationBuilder {
    private static final int MINIMUM_MEMORY_GB = 4;
    private static final int MINIMUM_STORAGE_GB = 128;

    protected String processor;
    protected String graphicsCard;
    protected int memoryGb;
    protected int storageGb;
    protected String monitor;
    protected String operatingSystem;
    protected final List<String> accessories = new ArrayList<>();

    @Override
    public WorkstationBuilder withProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public WorkstationBuilder withGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public WorkstationBuilder withMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
        return this;
    }

    @Override
    public WorkstationBuilder withStorageGb(int storageGb) {
        this.storageGb = storageGb;
        return this;
    }

    @Override
    public WorkstationBuilder withMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    @Override
    public WorkstationBuilder withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public WorkstationBuilder addAccessory(String accessory) {
        accessories.add(accessory);
        return this;
    }

    @Override
    public Workstation build() {
        validateRequiredText(processor, "processor");
        validateRequiredText(graphicsCard, "graphics card");
        validateRequiredText(monitor, "monitor");
        validateRequiredText(operatingSystem, "operating system");
        validateMinimum(memoryGb, MINIMUM_MEMORY_GB, "memoryGb");
        validateMinimum(storageGb, MINIMUM_STORAGE_GB, "storageGb");

        return new Workstation(
                processor,
                graphicsCard,
                memoryGb,
                storageGb,
                monitor,
                operatingSystem,
                accessories);
    }

    private void validateRequiredText(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(fieldName + " must be provided before build()");
        }
    }

    private void validateMinimum(int value, int minimum, String fieldName) {
        if (value < minimum) {
            throw new IllegalStateException(fieldName + " must be at least " + minimum);
        }
    }
}
