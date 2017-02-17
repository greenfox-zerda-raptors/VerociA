import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2017.02.17..
 */
public class JumpIn {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(3);
        numbersList.add(1);
        numbersList.add(4);
        numbersList.add(3);

        duplicateRemover(numbersList);

        System.out.println(numbersList);
    }

    public static ArrayList<Integer> duplicateRemover(ArrayList<Integer> numbers){
        for(int i=0; i < numbers.size(); i++){
            int x = numbers.get(i);
            for(int j = 1; j<(numbers.size()-1); j++){
                int y = numbers.get(j);{
                    if (x==y && numbers.indexOf(i)!=numbers.indexOf(j)){
                        numbers.remove(j);
                    }
                }
            }
        }return numbers;
    }
}
