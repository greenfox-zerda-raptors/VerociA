/**
 * Created by Verőci Ádám on 2016.11.07..
 */
public class Workshop20 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(factor(4));
    }
    public static int factor(int n){

        int fact=1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
