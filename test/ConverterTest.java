import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ConverterTest {
    @Test
    public void arabicToRomanOne() {
        Converter converter = new Converter();
        assertEquals("I", converter.arabicToRoman(1));
    }

    @Test
    public void arabicToRomanThree() {
        Converter converter = new Converter();
        assertEquals("III", converter.arabicToRoman(3));
    }
}
