import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    private Sum sum;

    @Before
    public void setUp() throws Exception {
        sum = new Sum();
    }

    @After
    public void tearDown() throws Exception {
        this.sum = null;
    }

    @Test
    public void sum() {
        assertEquals(this.sum.sum(3, 5), 8);
    }

    @Test
    public void min() {
        assertEquals(this.sum.min(5, 3), 2);
    }

    @Test
    public void mul() {
        assertEquals(this.sum.mul(3, 5), 15);
    }

    @Test
    public void div() {
        assertEquals(this.sum.div(15, 5), 3);
    }
}