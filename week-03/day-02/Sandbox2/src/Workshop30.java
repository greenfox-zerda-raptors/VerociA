/**
 * Created by Verőci Ádám on 2016.11.03..
 */
public class Workshop30 {
    public static void main(String[] args) {
        int ac = 8;
        int time = 200;
        String out = "";
        // if ac is dividable by 4
        // and time is not more than 200
        // set out to 'check'
        // if time is more than 200
        // set out to 'Time out'
        // otherwise set out to 'Run Forest Run!'

//        if (ac%4==0 && time<=200) out="check";
//            else if (time>200) out="Time out";
//                else out="Run Forest Run";

        if (time>200)
            out="Run Forest Run";
        else if (ac%4==0)
            out="check";
        else
            out="Time out";

        System.out.println(out);
    }
}
