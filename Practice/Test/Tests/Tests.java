import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */

public class Tests {
    Apple apple = new Apple();

    @Test
    public void testAdd() {
        assertEquals(5, apple.add(2, 3));
    }

    @Test
    public void testMax() {
        assertEquals(5, apple.max_of_three(3, 4, 5));
    }
}