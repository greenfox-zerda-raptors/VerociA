import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Verőci Ádám on 2016.11.07..
 */
public class Workshop16 {
    public static void main(String[] args) {
        String ae = "Misi";
        // create a function that greets ae

        System.out.println(greet(ae));
    }

    public static String greet (String a){
        return ("Szia "+a+"!");
    }
}
