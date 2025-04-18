package romanNumerals;

import org.junit.jupiter.api.*;
import java.util.regex.Pattern;

public class RomanNumeralsTests {

    private static final RomanNumeralsMain mainClass = new RomanNumeralsMain();


    @Test
    void containsOnlyAllowedLetter() {
        Pattern allowedLetters = Pattern.compile("([iIvVxXlLcCdDmM])*");
        assert allowedLetters.matcher(mainClass.turnIntToRomanNumeral(133)).matches();
    }

    @Test
    void isNotEmpty() {
        assert !mainClass.turnIntToRomanNumeral(1).isEmpty();
    }

    @Test
    void containsOnlyVAtMax() {
        int numberOfVs = 0;
        int numberOfLs = 0;
        int numberOfDs = 0;
        String romanNumeral = mainClass.turnIntToRomanNumeral(5);
        for (Character c : romanNumeral.toLowerCase().toCharArray()) {
            if (c == 'v') {
                numberOfVs++;
            } else if (c == 'l') {
                numberOfLs++;
            } else if (c == 'd') {
                numberOfDs++;
            }
        }
        assert numberOfVs < 2 && numberOfLs < 2 && numberOfDs < 2;
    }

    @Test
    void containsAnMIfGreaterThan888(){
        assert mainClass.turnIntToRomanNumeral(1000).toLowerCase().contains("m");
    }

    @Test
    void containsNoMIfSmallerThan889(){
        assert  !mainClass.turnIntToRomanNumeral(888).toLowerCase().contains("m");
    }

    @Test
    void numbersMatchUp() {
        assert mainClass.turnIntToRomanNumeral(899).toLowerCase().equals("dcccxcix");
        assert mainClass.turnIntToRomanNumeral(3999).toLowerCase().equals("mmmcmxcix");
        assert mainClass.turnIntToRomanNumeral(403).toLowerCase().equals("cdiii");
        assert mainClass.turnIntToRomanNumeral(1544).toLowerCase().equals("mdxliv");
    }
}