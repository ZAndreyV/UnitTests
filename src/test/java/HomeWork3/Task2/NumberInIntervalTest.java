package HomeWork3.Task2;
import static org.junit.Assert.*;
import org.junit.Test;
public class NumberInIntervalTest {
    @Test
    public void testNumberInInterval() {
        NumberInInterval number = new NumberInInterval();
        assertTrue(number.numberInInterval(50));
        assertTrue(number.numberInInterval(75));
        assertFalse(number.numberInInterval(10));
        assertFalse(number.numberInInterval(200));
        assertFalse(number.numberInInterval(25));
        assertFalse(number.numberInInterval(100));
    }

}
