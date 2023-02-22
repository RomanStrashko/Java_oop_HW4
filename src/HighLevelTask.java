public class HighLevelTask extends Task{
    private final String LEVEL_TASK = "high";

    public HighLevelTask(String topic, String responsible, String deadline) {
        super(topic, responsible, deadline);
    }

    public String getLEVEL_TASK() {
        return LEVEL_TASK;
    }

    @Override
    public String toString() {
        return "HighLevelTask{" +
                "LEVEL_TASK='" + LEVEL_TASK + '\'' + "--" +
                super.toString() +
                '}';
    }
}
