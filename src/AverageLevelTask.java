public class AverageLevelTask extends Task{

    private final String LEVEL_TASK = "Average";


    public AverageLevelTask(String topic, String responsible, String deadline) {
        super(topic, responsible, deadline);
    }

    public String getLEVEL_TASK() {
        return LEVEL_TASK;
    }

    @Override
    public String toString() {
        return "AverageLevelTask{" +
                "LEVEL_TASK='" + LEVEL_TASK + '\'' +
                "} " + super.toString();
    }
}
