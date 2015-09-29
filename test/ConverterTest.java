import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ConverterTest {
    Converter converter;

    @Before
    public void setup() {
        converter = new Converter();
    }
    @Test
    public void arabicToRomanOne() {
        assertEquals("I", converter.arabicToRoman(1));
    }

    @Test
    public void arabicToRomanThree() {
        assertEquals("III", converter.arabicToRoman(3));
    }

    @Test
    public void arabicToRomanFour() {
        assertEquals("IV", converter.arabicToRoman(4));
    }
}
