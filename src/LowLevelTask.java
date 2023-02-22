public class LowLevelTask extends Task{
    private final String LEVEL_TASK = "low";


    public LowLevelTask(String topic, String responsible, String deadline) {
        super(topic, responsible, deadline);
    }

    public String getLEVEL_TASK() {
        return LEVEL_TASK;
    }

    @Override
    public String toString() {
        return "LowLevelTask{" +
                "LEVEL_TASK='" + LEVEL_TASK + '\'' +
                "} " + super.toString();
    }
}
