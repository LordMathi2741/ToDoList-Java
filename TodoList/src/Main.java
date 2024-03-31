import Agregates.Task;
import Controllers.Controller;
import Enums.ListType;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<Task>();
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Modify task");
            System.out.println("4. Modify task type");
            System.out.println("5. Show all list");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.next();
                    controller.AddTask(new Task(task, ListType.TODO), list);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    controller.RemoveTask(index , list);
                    break;
                case 3:
                    System.out.print("Enter task index to modify: ");
                    int modifyIndex = scanner.nextInt();
                    System.out.print("Enter new task: ");
                    String newTask = scanner.next();
                    controller.ModifyTask(newTask, list, modifyIndex);
                    break;
                case 4:
                    System.out.print("Enter task index to modify: ");
                    int modifyTypeIndex = scanner.nextInt();
                    System.out.print("Enter new task type (TODO/DONE): ");
                    String newType = scanner.next();
                    controller.ModifyTaskType(ListType.valueOf(newType), list, modifyTypeIndex);
                    break;
                case 5:
                    controller.GetAllTasks(list);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}