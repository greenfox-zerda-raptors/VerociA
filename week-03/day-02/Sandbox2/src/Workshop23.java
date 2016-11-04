/**
 * Created by Verőci Ádám on 2016.11.03..
 */
import java.util.Scanner;


public class Workshop23
{
        // print 'Yeah!' if dividable by 4 but print 'End of program' after regardless

    static Scanner userInput= new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number:");

        while (userInput.hasInt())
        {
            if (userInput.nextInt() % 4 == 0) System.out.println("Yeah divides by four ");
        }

        System.out.println("End of program");

    }
}
