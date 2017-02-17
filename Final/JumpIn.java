import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2017.02.17..
 */
public class JumpIn {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(3);
        alist.add(1);
        alist.add(4);
        alist.add(3);

        duplicateRemover(alist);

        System.out.println(alist);
    }

    public static ArrayList<Integer> duplicateRemover(ArrayList<Integer> numbers){
        for(int i=0; i<numbers.size(); i++){
            int x = numbers.get(i);
            for(int j=1; j<((numbers.size())-1); j++){
                int y = numbers.get(j);{
                    if (x==y){
                        numbers.remove(y);
                    }
                }
            }
        }return numbers;
    }
}
