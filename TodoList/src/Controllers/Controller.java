package Controllers;

import Agregates.List;
import Enums.ListType;
import Interfaces.IListMethods;

import java.util.ArrayList;

public class Controller implements IListMethods {

    @Override
    public void AddTask(List task, ArrayList<List>tasks ) {
        tasks.add(task);
    }

    @Override
    public void RemoveTask(int index, ArrayList<List> tasks ) {
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    @Override
    public void ModifyTask(String newTask, ArrayList<List> tasks, int index) {
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).setTask(newTask);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    @Override
    public void ModifyTaskType(ListType newType, ArrayList<List> tasks, int index) {
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).setType(newType);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }


    //obtener las tareas de la lista
    public String getTaskAtList(List task ){
        return task.getTask() + " " + task.getType();

    }

    //obtener todas las tareas
    public void GetAllTasks(ArrayList<List>tasks){
        for(List task: tasks){
            System.out.println(task.getTask() + " " + task.getType());
        }

    }





}
