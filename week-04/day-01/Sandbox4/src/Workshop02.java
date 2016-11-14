/**
 * Created by Verőci Ádám on 2016.11.12..
 */
import java.util.*;

public class Workshop02{
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        ArrayList arrayList = new ArrayList(); // ??


        arrayList.addAll(Arrays.asList(numbers));

        System.out.println(arrayList);
    }
}
