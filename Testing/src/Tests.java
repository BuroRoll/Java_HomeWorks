import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test(expected = NumberFormatException.class)
    public void ZeroLengthStringTest() {
        Integer.decode("");
    }

    @Test(expected = NumberFormatException.class)
    public void InputStringTest() {
        Integer.decode("one");
    }

    @Test
    public void PositiveNumberTest(){
        assertEquals(111, (int)Integer.decode("111"));
        assertEquals(111, (int)Integer.decode("+111"));
    }

    @Test
    public void NegativeNumberTest(){
        assertEquals(-111, (int)Integer.decode("-111"));
    }

    @Test
    public void HexDigitTest() {
        assertEquals(2655, (int) Integer.decode("0xa5f"));
        assertEquals(85, (int) Integer.decode("0125"));
        assertEquals(2801, (int) Integer.decode("#af1"));
    }

    @Test(expected = NumberFormatException.class)
    public void NumberFormatTest(){
        Integer.decode("5-6");
        Integer.decode("0xa5f-0xa5f");
        Integer.decode("0125-0125");
        Integer.decode("#af1-#af1");
        Integer.decode("5+6");
        Integer.decode("0xa5f+0xa5f");
        Integer.decode("0125+0125");
        Integer.decode("#af1+#af1");
    }

    @Test
    public void IntegerMaxValueTest() {
        assertEquals(Integer.MAX_VALUE, (int) Integer.decode(Integer.toString(Integer.MAX_VALUE)));
    }

    @Test
    public void IntegerMinValueTest() {
        assertEquals(Integer.MIN_VALUE, (int) Integer.decode(Integer.toString(Integer.MIN_VALUE)));
    }
}
