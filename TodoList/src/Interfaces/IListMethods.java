package Interfaces;

import Agregates.Task;
import Enums.ListType;

import java.util.ArrayList;

public interface IListMethods {
    public void AddTask(Task task, ArrayList<Task> tasks);
    public void RemoveTask(int index, ArrayList<Task> tasks);
    public void ModifyTask(String newTask, ArrayList<Task> tasks, int index);
    public void ModifyTaskType(ListType newType, ArrayList<Task> tasks, int index);
}
