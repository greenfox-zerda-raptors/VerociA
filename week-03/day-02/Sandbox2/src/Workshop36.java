/**
 * Created by Verőci Ádám on 2016.11.04..
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replaceable, hence store it in a variable

        char hashtag='#';

        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(j%2!=0){
                    System.out.print(hashtag);
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
