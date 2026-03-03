import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<ToDoTask> tasks;

    public Manager() {
        this.tasks = new ArrayList<>();
    }

    public List<ToDoTask> getTasks() {
        return new ArrayList<>(tasks);
    }

    public boolean addTask(ToDoTask t) {
        if (this.tasks.add(t)) return true;
        else return false;
    }

    public boolean removeById(int id) {
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getId() == id) {
                this.tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public ToDoTask searchByID(int id) {
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getId() == id) {
                ToDoTask t = this.tasks.get(i);
                return t;
            }
        }
        return null;
    }
}
