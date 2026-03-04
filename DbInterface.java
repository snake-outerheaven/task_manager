import java.util.Collection;
import java.util.List;

// interface que define o contato entre o domínio da aplicação e persistência.

public interface DbInterface {
    void saveAll(Collection<ToDoTask> tasks);
    List<ToDoTask> loadAll();
}
