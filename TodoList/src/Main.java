import Agregates.List;
import Controllers.Controller;
import Enums.ListType;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<List> tasks = new ArrayList<List>();
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Modify task");
            System.out.println("4. Modify task type");
            System.out.println("5. Show all tasks");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.next();
                    controller.AddTask(new List(task, ListType.TODO), tasks);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    controller.RemoveTask(index , tasks);
                    break;
                case 3:
                    System.out.print("Enter task index to modify: ");
                    int modifyIndex = scanner.nextInt();
                    System.out.print("Enter new task: ");
                    String newTask = scanner.next();
                    controller.ModifyTask(newTask, tasks, modifyIndex);
                    break;
                case 4:
                    System.out.print("Enter task index to modify: ");
                    int modifyTypeIndex = scanner.nextInt();
                    System.out.print("Enter new task type (TODO/DONE): ");
                    String newType = scanner.next();
                    controller.ModifyTaskType(ListType.valueOf(newType), tasks, modifyTypeIndex);
                    break;
                case 5:
                    controller.GetAllTasks(tasks);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}