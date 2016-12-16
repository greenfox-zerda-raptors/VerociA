package App.Do.To;

/**
 * Created by Verőci Ádám on 2016.12.15..
 */
public class Menu {

    public Menu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Adam's Todo App" + '\n');
        menu.append("================" + '\n');
        menu.append("Available commands:" + '\n');
        menu.append("list(l)       Lists all the tasks" + '\n');
        menu.append("add(a)        Adds a new task" + '\n');
        menu.append("remove(r)     Removes a task" + '\n');
        menu.append("help(h)       Print out this list again" + '\n');
        menu.append("quit(q)       To quit" + '\n');
        menu.append("Please choose one of the methods listed above:");
        System.out.println(menu);
    }

}