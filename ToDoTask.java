// entidade do domínio.

public class ToDoTask {

    private int id;
    private String name;
    private String desc;
    private boolean active;

    public ToDoTask() {
        this.id = 0;
        this.name = "";
        this.desc = "";
        this.active = false;
    }

    public ToDoTask(int id, String name, String desc, boolean active) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
