import java.util.List;
import java.util.Objects;

/**
 * Immutable product created by a WorkstationBuilder.
 */
public final class Workstation {
    private final String processor;
    private final String graphicsCard;
    private final int memoryGb;
    private final int storageGb;
    private final String monitor;
    private final String operatingSystem;
    private final List<String> accessories;

    Workstation(
            String processor,
            String graphicsCard,
            int memoryGb,
            int storageGb,
            String monitor,
            String operatingSystem,
            List<String> accessories) {
        this.processor = Objects.requireNonNull(processor, "processor must not be null");
        this.graphicsCard = Objects.requireNonNull(graphicsCard, "graphics card must not be null");
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
        this.monitor = Objects.requireNonNull(monitor, "monitor must not be null");
        this.operatingSystem = Objects.requireNonNull(operatingSystem, "operating system must not be null");
        this.accessories = List.copyOf(accessories);
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "processor='" + processor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", memoryGb=" + memoryGb +
                ", storageGb=" + storageGb +
                ", monitor='" + monitor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", accessories=" + accessories +
                '}';
    }
}
