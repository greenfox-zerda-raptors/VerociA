/**
 * Created by Verőci Ádám on 2016.11.07..
 */
public class Workshop18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(sumNumber(10));

    }

    public static int sumNumber(int n){

        int sum=0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
