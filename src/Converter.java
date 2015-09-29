public class Converter {

    private static final String[] ones = {"I", "X", "C", "M"};
    private static final String[] fives = {"V", "L", "D"};

    /**
     * Converts an Arabic number to a Roman Numeral.
     * @param arabicNumber - Arabic number to be converted. Must be between 0 and 3999.
     * @return - The Roman Numeral representation of the Arabic number.
     */
    public String arabicToRoman(int arabicNumber) {
        if(arabicNumber < 0 || arabicNumber > 3999) {
            throw new IllegalArgumentException("Number must be between 0 and 3999.");
        }
        String roman = "";
        /* columnIndex values: 3=thousands, 2=hundreds, 1=tens, 0=ones. */
        int lastIndex = Integer.toString(arabicNumber).toCharArray().length - 1;
        int columnIndex = lastIndex;
        while(columnIndex >= 0) {
            int curDigit = Character.getNumericValue(Integer.toString(arabicNumber).toCharArray()[lastIndex - columnIndex]);
            if(curDigit == 4) {
                roman += ones[columnIndex] + fives[columnIndex];
            }
            else if(curDigit == 9) {
                roman += ones[columnIndex] + ones[columnIndex+1];
            }
            else {
                int remaining = curDigit;
                while(remaining > 0) {
                    if(remaining >= 5) {
                        roman += fives[columnIndex];
                        remaining -= 5;
                    }
                    else {
                        roman += ones[columnIndex];
                        remaining -= 1;
                    }
                }
            }
            columnIndex--;
        }
        return roman;
    }

    /**
     * Converts a Roman Numeral to an Arabic number.
     * @param roman - Roman Numeral to be converted.
     * @return - The Arabic number representation of the Roman Numeral.
     */
    public int romanToArabic(String roman) {
        int arabic = 0;
        for(int i=0; i<roman.length(); i++) {
            arabic+=1;
        }


        return arabic;
    }
}



