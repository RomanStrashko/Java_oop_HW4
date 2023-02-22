import java.util.concurrent.Callable;

public class Program {
    public static void main(String[] args) {

        Calendar<Task> plan = new Calendar<>("plan");
       plan.addtask(new AverageLevelTask("Тема", "Roman", "8 августа 2023 года"));
        System.out.println(plan.get(0));

        System.out.println(plan.count());


    }
}
