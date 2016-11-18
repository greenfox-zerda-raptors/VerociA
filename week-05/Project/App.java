package App.Do.To;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Verőci Ádám on 2016.11.17..
 */
public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Adam's Todo App");
        System.out.println("================");
        System.out.println("Available commands:");
        System.out.println("list(l)       Lists all the tasks");
        System.out.println("add(a)        Adds a new task");
        System.out.println("remove(r)     Removes a task");
        System.out.println("complete(c)   Completes a task");
        System.out.println("help(h)       Print out this list again");

        System.out.println("Please choose one of the methods listed above:");


        ToDoList  tasklist= new ToDoList();

        // reading
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/Code/file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line="";
            while (line != null) {
                line = br.readLine();
                if (line != null) {

                    tasklist.add(new ToDoItem(line));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        while (userInput != null) {

            try {
               String command = userInput.next();
                userInput.nextLine();
                switch (command) {
                    case "list":
                    case "l":
                        for (ToDoItem temp : tasklist) {
                            System.out.println(temp.toString());
                        }
                        System.out.println("Type another method or q to quit");
                        break;

                    case "add":
                    case "a":
                        System.out.print("Enter the task you need to add: ");
                        String task = userInput.nextLine();
                        tasklist.add(new ToDoItem(task));
                        if (task != null) {
                            System.out.println("Added task: " + task);
                        }
                        break;

                    case "remove":
                    case "r":
                        System.out.print("Enter the task you need to remove ");
                        String rem = userInput.nextLine();
                        tasklist.remove(tasklist.get(Integer.valueOf(rem)-1));
                        for (int i=0; i<tasklist.size(); i++){
                            tasklist.get(i).setI((i+1));
                        }
                        if (rem != null) {
                            System.out.println("Removed: " + rem);
                        } else {
                            System.out.println("The to-do list is already empty.");
                        }
                        break;

                    case "complete":
                    case "c":
                        System.out.print("Enter the index of the item to complete: ");
                        String index = userInput.nextLine();
                    //    tasklist.add(index);
                    //    tasklist.tasks.remove(index);
                        System.out.println("Completed: " + index);
                        if (index != null) {
                            System.out.println(index + " " + "Moved to completed tasks ");
                        }
                        break;
                    case "help":
                    case "h":

                        System.out.println("Adam's Todo App");
                        System.out.println("================");
                        System.out.println("Available commands:");
                        System.out.println("list(l)       Lists all the tasks");
                        System.out.println("add(a)        Adds a new task");
                        System.out.println("remove(r)     Removes a task");
                        System.out.println("complete(c)   Completes a task");

                        System.out.println("Please choose one of the methods listed above:");

                        break;

                    case "quit":
                    case "q":

                        try {
                            String content;
                            BufferedWriter bw = new BufferedWriter(new FileWriter("d:/Code/file.txt"));
                            for (ToDoItem item : tasklist) {
                                content = item.toStringWrite();
                                bw.write(content);
                                bw.newLine();
                            }
                            bw.close();
                            System.out.println("Your list is saved.");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.exit(0);
                    default:
                        System.out.println("Sorry, but " + command + " is not one of " +
                                "the menu choices. Please try again.");
                        break;
                }
            } catch (java.util.InputMismatchException ime) {
                System.out.println("Sorry, but you must enter a number.");
                userInput.nextLine();
            }
        }
    }
}


