/**
 * Created by Verőci Ádám on 2016.11.09..
 */
/**************************************************************************************************
 * Workshop: Practice With Exceptions: InputMismatchException
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/

import java.util.*;

public class Workshop03{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Integer number = 1;
        String s ;
        while (number !=0 ) {
            number = checkIfValid();
            s = number.toString();
            System.out.println("Yum" +  s.substring(0,s.length()/2));
        }
    }

    public static Integer checkIfValid() {

        int i =0;
        boolean flLoop = true;

        while (flLoop) {
            System.out.print("Type in a number: ");
            try {
                i = userInput.nextInt();
                flLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Too high");
            }
            userInput.nextLine();
        }
            return i;
    }
   } //Workshop03

