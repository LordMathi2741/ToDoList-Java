package Controllers;

import Agregates.Task;
import Enums.ListType;
import Interfaces.IListMethods;

import java.util.ArrayList;

public class Controller implements IListMethods {

    @Override
    public void AddTask(Task task, ArrayList<Task>list ) {
        list.add(task);
    }

    @Override
    public void RemoveTask(int index, ArrayList<Task> list ) {
        if(index >= 0 && index < list.size()){
            list.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    @Override
    public void ModifyTask(String newTask, ArrayList<Task> list, int index) {
        if(index >= 0 && index < list.size()){
            list.get(index).setTask(newTask);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    @Override
    public void ModifyTaskType(ListType newType, ArrayList<Task> list, int index) {
        if(index >= 0 && index < list.size()){
            list.get(index).setType(newType);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }


    //obtener las tareas de la lista
    public String getTaskAtList(Task task ){
        return task.getTask() + " " + task.getType();

    }

    //obtener todas las tareas
    public void GetAllTasks(ArrayList<Task>list){
        for(Task task: list){
            System.out.println(task.getTask() + " " + task.getType());
        }

    }





}
