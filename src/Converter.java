public class Converter {

    public String arabicToRoman(int arabicNumber) {
        int remaining = arabicNumber;
        String roman = "";
        while(remaining > 0) {
            roman += "I";
            remaining -= 1;
        }
        return roman;
    }
}
