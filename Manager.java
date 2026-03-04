import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// serviço de aplicação que rege a lógica de negócio
// sobre as entidades do domínio.

public class Manager {

    private List<ToDoTask> tasks;

    public Manager() {
        this.tasks = new ArrayList<>();
    }

    public List<ToDoTask> getTasks() {
        return new ArrayList<>(tasks);
    }

    public boolean addTask(ToDoTask t) {
        return this.tasks.add(t);
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

    public ToDoTask searchById(int id) {
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getId() == id) {
                ToDoTask t = this.tasks.get(i);
                return t;
            }
        }
        return null;
    }

    public void sortById() {
        this.tasks.sort(Comparator.comparingInt(ToDoTask::getId)); // aprender melhores algoritmos do que bubble sort.
    }
}
