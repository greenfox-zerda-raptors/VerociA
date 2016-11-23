/**
 * Created by Verőci Ádám on 2016.11.21..
 */
public class Fibonacci {
    public static void main(String args[])
    {
        System.out.println(fib(6));//printing 0 and 1
    }

    public static int fib(int p){
        int n1=0,n2=1,n3,i;
        if (p<=0) return 0;
        else if (p==1) return 1;
        else if (p==2) return 1;
        else {
            n1=1;
            n2=1;
            n3=0;
            for(i=3;i<=p;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            return n3;
        }
    }
}

