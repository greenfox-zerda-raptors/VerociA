package App.Do.To;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.11.17..
 */
public class ToDoList {

    Scanner userInput = new Scanner(System.in);

    public ToDoList() {
        ArrayList<ToDoItem> taskList = new ArrayList<>();

        while (userInput != null) {

            String command = userInput.next();
            userInput.nextLine();
            switch (command) {
                case "list":
                case "l":
                    for (ToDoItem temp : taskList) {
                        System.out.println(temp.toString());
                    }
                    System.out.println("Type another method or q to quit");
                    break;

                case "add":
                case "a":
                    System.out.print("Enter the new task: ");
                    String task = userInput.nextLine();
                    ToDoItem item = new ToDoItem(task);
                    taskList.add(item);
                    item.setIndex(taskList.size());
                    System.out.println("Added task: " + task);
                    break;

                case "remove":
                case "r":
                    if (taskList.size() == 0) {
                        System.out.println("The to-do list is already empty.");
                    } else {
                        System.out.print("Enter the task you need to remove ");
                        try {
                            String rem = userInput.nextLine();

                            System.out.println("Removed: " + rem);

                            taskList.remove(taskList.get(Integer.valueOf(rem) - 1));
                            for (int i = 0; i < taskList.size(); i++) {
                                taskList.get(i).setIndex(i+1);
                            }
                        } catch (java.lang.NumberFormatException e) {
                            System.out.println("Sorry, but you must enter a number.");
                            userInput.nextLine();
                        }
                    }
                    break;

                case "complete":
                case "c":
                    System.out.print("Enter the index of the item to complete: ");
                    String index = userInput.nextLine();
                    System.out.println("Completed: " + index);
                    if (index != null) {
                        System.out.println(index + " " + "Moved to completed tasks ");
                    }
                    break;

                case "help ":
                case "h":

                    System.out.println(new Menu());
                    break;

                case "quit":
                case "q":

                    System.exit(0);
                default:
                    System.out.println("Sorry, but " + command + " is not one of " +
                            "the menu choices. Please try again.");
                    break;
            }
        }
    }
}