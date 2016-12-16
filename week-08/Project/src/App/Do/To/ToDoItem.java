package App.Do.To;

/**
 * Created by Verőci Ádám on 2016.11.17..
 */
public class ToDoItem {

    static int count = 0;
    private int index;
    private String string;


    public ToDoItem(String s) {
        count ++;
        this.index = count;
        this.string= s;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString(){
    return  (index + " "+ string);
    }

}