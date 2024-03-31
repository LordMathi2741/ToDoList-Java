package Agregates;
import Enums.ListType;

public class Task {

    private ListType type;
    private String taskName;

    public Task(String s, ListType type) {
        this.type = type;
        this.taskName = s;
    }


    //crear setters
    public void setTask(String task) {
        this.taskName = task;
    }

    public void setType(ListType type) {
        this.type = type;
    }

    public String getTask() {
        return this.taskName;
    }

    public String getType() {
        return this.type.toString();
    }

}
