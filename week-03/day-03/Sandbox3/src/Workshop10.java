import java.util.Arrays;

/**
 * Created by Verőci Ádám on 2016.11.07..
 */
public class Workshop10 {
    public static void main(String[] args) {
        // Task 1: Create an array (jagged) which can contain the different shades of specified colors
        // in colors[0] store the shades of green: "lime", "forest green", "olive", "pale green", "spring green"
        // in colors[1] store the shades of red: "orange red", "red", "tomato"
        // in colors[2] store the shades of pink: "orchid", "violet", "pink", "hot pink"

        // Task 2: Print the values of the array to the console

        String colors[][]={{"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}};

        // Task 2: Print the values of the array to the console

        for (int i=0; i<colors.length; i++) {
            System.out.print(Arrays.toString(colors[i]) + "\n");
        }
    }
}
