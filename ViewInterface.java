import java.util.List;

public interface ViewInterface {
    void displayTask(ToDoTask t);
    void displayAll(List<ToDoTask> tasks);
    void displayMessage(String msg);

    ToDoTask createTask();
    int getTaskIdInput();
    ToDoTask updateTask();
}
