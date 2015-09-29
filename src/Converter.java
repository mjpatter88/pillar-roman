public class Converter {

    /**
     * Converts an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic number to be converted.
     * @return - The Roman Numeral representation of the Arabic number.
     */
    public String arabicToRoman(int arabicNumber) {
        return arabicToRomanTens(arabicNumber) + arabicToRomanOnes(arabicNumber);
    }

    /**
     * Converts the tens column of an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic number to be converted.
     * @return - The Roman Numeral representation of the tens column.
     */
    private String arabicToRomanTens(int arabicNumber) {
        int arabicNumberTens = (arabicNumber % 100)/10; // We only care about the tens (intentionally dropping the ones)
        String roman = "";
        if(arabicNumberTens == 4) {
            roman = "XL";
        }
        else {
            int remaining = arabicNumberTens;
            while(remaining > 0) {
                if(remaining >= 5) {
                    roman += "L";
                    remaining -= 5;
                }
                roman += "X";
                remaining -= 1;
            }
        }
        return roman;
    }

    /**
     * Converts the ones column of an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic number to be converted.
     * @return - The Roman Numeral representation of the ones column.
     */
    private String arabicToRomanOnes(int arabicNumber) {
        int arabicNumberOnes = arabicNumber % 10;  // We only care about the ones column.
        String roman = "";
        if(arabicNumberOnes == 4) {
            roman = "IV";
        }
        else if(arabicNumberOnes == 9) {
            roman = "IX";
        }
        else {
            int remaining = arabicNumberOnes;
            while(remaining > 0) {
                if(remaining >= 5) {
                    roman += "V";
                    remaining -= 5;
                }
                else {
                    roman += "I";
                    remaining -= 1;
                }
            }
        }
        return roman;
    }
}
