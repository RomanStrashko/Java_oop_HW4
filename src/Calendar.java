import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Calendar<T extends Task> {
    List<T> list;

    private String name;

    public Calendar(String name) {
        this.list = new ArrayList<>();
        this.name = name;

    }

    public void addtask(T task){
        list.add(task);
    }

    public T get(Integer index){
        return list.get(index);
    }

    public int count(){
        return list.size();
    }

    
}
