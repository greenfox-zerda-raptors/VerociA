/**
 * Created by Verőci Ádám on 2016.11.07..
 */
public class Workshop07 {

    public static void main(String[] args) {
        // What's the problem with this code fragment? Fix it!

        int[] array=new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = i * i;

        for (int j:array){
            System.out.print(j + " ");
        }
    }
}
