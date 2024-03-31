package Interfaces;

import Agregates.List;
import Enums.ListType;

import java.util.ArrayList;

public interface IListMethods {
    public void AddTask(List task, ArrayList<List> tasks);
    public void RemoveTask(int index, ArrayList<List> tasks);
    public void ModifyTask(String newTask, ArrayList<List> tasks, int index);
    public void ModifyTaskType(ListType newType, ArrayList<List> tasks, int index);
}
