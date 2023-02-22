import java.util.Objects;

public class Task {

    private String topic;
    private String responsible;
    private String deadline;

    public Task(String topic, String responsible, String deadline) {
        this.topic = topic;
        this.responsible = responsible;
        this.deadline = deadline;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "topic='" + topic + '\'' +
                ", responsible='" + responsible + '\'' +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(topic, task.topic) && Objects.equals(responsible, task.responsible) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, responsible, deadline);
    }
}
