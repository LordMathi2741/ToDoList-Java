package Agregates;
import Enums.ListType;

public class List {

    private ListType type;
    private String task;

    public List(String s, ListType type) {
        this.type = type;
        this.task = s;
    }


    //crear setters
    public void setTask(String task) {
        this.task = task;
    }

    public void setType(ListType type) {
        this.type = type;
    }

    public String getTask() {
        return this.task;
    }

    public String getType() {
        return this.type.toString();
    }

}
