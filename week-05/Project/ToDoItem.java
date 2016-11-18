package App.Do.To;

/**
 * Created by Verőci Ádám on 2016.11.17..
 */
public class ToDoItem {

    static int ct = 0;
    private int i;
    private String s;


    public ToDoItem(String s) {
        ct++;
        this.i = ct;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String toString(){
    return  (i+ " "+s);
    }

    public String toStringWrite(){
        return (s);
    }
}