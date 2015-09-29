import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ConverterTest {
    @Test
    public void arabicToRomanOne() {
        Converter converter = new Converter();
        assertEquals("I", converter.arabicToRoman(1));
    }
}
