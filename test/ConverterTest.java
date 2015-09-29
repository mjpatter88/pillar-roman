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

    /************************************** Ones Tests ****************************************************************/
    @Test
    public void arabicToRoman1() {
        assertEquals("I", converter.arabicToRoman(1));
    }

    @Test
    public void arabicToRoman3() {
        assertEquals("III", converter.arabicToRoman(3));
    }

    @Test
    public void arabicToRoman4() {
        assertEquals("IV", converter.arabicToRoman(4));
    }

    @Test
    public void arabicToRoman6() {
        assertEquals("VI", converter.arabicToRoman(6));
    }

    @Test
    public void arabicToRoman9() {
        assertEquals("IX", converter.arabicToRoman(9));
    }

    /***************************************** Tens Tests *************************************************************/
    @Test
    public void arabicToRoman12() {
        assertEquals("XII", converter.arabicToRoman(12));
    }

    @Test
    public void arabicToRoman32() {
        assertEquals("XXXII", converter.arabicToRoman(32));
    }

    @Test
    public void arabicToRoman44() {
        assertEquals("XLIV", converter.arabicToRoman(44));
    }

    @Test
    public void arabicToRoman66() {
        assertEquals("LXVI", converter.arabicToRoman(66));
    }

    @Test
    public void arabicToRoman90() {
        assertEquals("XC", converter.arabicToRoman(90));
    }

    /******************************************* Hundreds Tests *******************************************************/
    @Test
    public void arabicToRoman120() {
        assertEquals("CXX", converter.arabicToRoman(120));
    }

    @Test
    public void arabicToRoman320() {
        assertEquals("CCCXX", converter.arabicToRoman(320));
    }

    @Test
    public void arabicToRoman440() {
        assertEquals("CDXL", converter.arabicToRoman(440));
    }

    @Test
    public void arabicToRoman660() {
        assertEquals("DCLX", converter.arabicToRoman(660));
    }

    @Test
    public void arabicToRoman900() {
        assertEquals("CM", converter.arabicToRoman(900));
    }

    /******************************************* Thousands Tests ******************************************************/
    @Test
    public void arabicToRoman1066() {
        assertEquals("MLXVI", converter.arabicToRoman(1066));
    }

    @Test
    public void arabicToRoman1989() {
        assertEquals("MCMLXXXIX", converter.arabicToRoman(1989));
    }

    /******************************************* Illegal input Tests **************************************************/
}
