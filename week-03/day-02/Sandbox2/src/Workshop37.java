/**
 * Created by Verőci Ádám on 2016.11.04..
 */
public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replaceable, hence store it in a variable
        char hashtag='#';
        char out;
        char out2;

        for(int i=1;i<8;i++){
            if (i%2!=0){
                out=hashtag;
                out2=' ';
            }
            else {
                out=' ';
                out2=hashtag;
            }
            for(int j=1;j<16;j++){
                if(j%2!=0){
                    System.out.print(out);
                }
                else{
                    System.out.print(out2);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
