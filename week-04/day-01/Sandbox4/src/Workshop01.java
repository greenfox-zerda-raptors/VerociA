/**
 * Created by Verőci Ádám on 2016.11.12..
 */
import java.util.*;

public class Workshop01{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        // Add multiple elements to the list and print the number of the elements

        arrayList.addAll(Arrays.asList("proba", "szavak"));

        System.out.println(arrayList.size());
    }
}
