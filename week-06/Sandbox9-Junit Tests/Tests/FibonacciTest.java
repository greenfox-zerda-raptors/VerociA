import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Verőci Ádám on 2016.11.21..
 */
public class FibonacciTest {
    @Test
    public void fibTest() throws Exception {
        assertEquals(55,Fibonacci.fib(10));

        assertEquals(0,Fibonacci.fib(-4));

    }

}