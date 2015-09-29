public class Converter {

    /**
     * Converts an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic number to be converted.
     * @return - The Roman Numeral representation of the Arabic number.
     */
    public String arabicToRoman(int arabicNumber) {
        return arabicToRomanOnes(arabicNumber);
    }

    /**
     * Converts the ones column of an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic Number to be converted.
     * @return - The Roman Numeral representation of the ones column.
     */
    private String arabicToRomanOnes(int arabicNumber) {
        if(arabicNumber > 9 || arabicNumber < 0) {
            throw new IllegalArgumentException(arabicNumber + "is out of range.");
        }
        String roman = "";
        if(arabicNumber == 4) {
            roman = "IV";
        }
        else {
            int remaining = arabicNumber;
            while(remaining > 0) {
                roman += "I";
                remaining -= 1;
            }
        }
        return roman;
    }
}
