import junit.framework.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;


public class ConverterTest {
    Converter converter;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setup() {
        converter = new Converter();
    }

    /************************************** Arabic to Roman: Ones Tests ***********************************************/
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

    /***************************************** Arabic to Roman: Tens Tests ********************************************/
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

    /******************************************* Arabic to Roman: Hundreds Tests **************************************/
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

    /******************************************* Arabic to Roman: Thousands Tests *************************************/
    @Test
    public void arabicToRoman1066() {
        assertEquals("MLXVI", converter.arabicToRoman(1066));
    }

    @Test
    public void arabicToRoman1989() {
        assertEquals("MCMLXXXIX", converter.arabicToRoman(1989));
    }

    /******************************************* Arabic to Roman: Illegal input Tests *********************************/
    @Test
    public void arabicToRomanNegative() {
        thrown.expect(IllegalArgumentException.class);
        converter.arabicToRoman(-5);
    }

    @Test
    public void arabicToRomanTooBig() {
        thrown.expect(IllegalArgumentException.class);
        converter.arabicToRoman(9000);
    }

    /************************************** Roman to Arabic: Ones Tests ***********************************************/
    @Test
    public void romanToArabic1() {
        assertEquals(1, converter.romanToArabic("I"));
    }

    @Test
    public void romanToArabic3() {
        assertEquals(3, converter.romanToArabic("III"));
    }

    @Test
    public void romanToArabic4() {
        assertEquals(4, converter.romanToArabic("IV"));
    }

    @Test
    public void romanToArabic6() {
        assertEquals(6, converter.romanToArabic("VI"));
    }

    @Test
    public void romanToArabic9() {
        assertEquals(9, converter.romanToArabic("IX"));
    }
}
