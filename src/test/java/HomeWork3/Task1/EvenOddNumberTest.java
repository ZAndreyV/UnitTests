package HomeWork3.Task1;
import static org.junit.Assert.*;

import HomeWork3.Task1.EvenOddNumber;
import org.junit.Test;

public class EvenOddNumberTest {
    @Test
    public void testEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(2));
        assertTrue(evenOddNumber.evenOddNumber(0));
        assertTrue(evenOddNumber.evenOddNumber(-4));
    }

    @Test
    public void testOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(5));
        assertFalse(evenOddNumber.evenOddNumber(-3));
    }
}
