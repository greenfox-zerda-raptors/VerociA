import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Verőci Ádám on 2016.11.21..
 */
public class AppleTest {


    @Test
    public void getName() throws Exception {
        Apple myObject= new Apple();

        assertEquals("apple", myObject.getName());
    }

}