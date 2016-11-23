import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Verőci Ádám on 2016.11.21..
 */
public class Sum {


    public static void main(String[] args) {
        ArrayList<Integer> sumof = new ArrayList<>();

//     sumof.add(2);
//     sumof.add(5);
//     sumof.add(8);
        // OR

        sumof.addAll(Arrays.asList(2, 3, 8, 12));
        sumok(sumof);
    }

    public static Integer sumok(List<Integer>list){
        Integer sumok = 0;
        for (Integer i = 0; i < list.size(); i++) {
            sumok += list.get(i);
        }
            System.out.println(sumok);
            return sumok;

        }


    }






