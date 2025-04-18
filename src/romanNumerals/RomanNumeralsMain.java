package romanNumerals;

public class RomanNumeralsMain {

    String turnIntToRomanNumeralB(int i){
        String romanNumeral = "";
        while (i != 0) {
            while (i > 888) {
                romanNumeral = romanNumeral.concat("m");
                i = i - 1000;
            }
            if (i > 388) {
                romanNumeral = romanNumeral.concat("d");
                i = i - 500;
            }
            while (i > 88) {
                romanNumeral = romanNumeral.concat("x");
                i = i - 100;
            }
            if (i > 38) {
                romanNumeral = romanNumeral.concat("l");
                i = i - 50;
            }
            while (i > 8) {
                romanNumeral = romanNumeral.concat("x");
                i = i - 10;
            }
            if (i > 3) {
                romanNumeral = romanNumeral.concat("v");
                i = i - 5;
            }
            while (i > 0) {
                romanNumeral = romanNumeral.concat("i");
                i = i - 1;
            }


        }
        return romanNumeral;
    }

    String turnIntToRomanNumeral(int number) {
        // maximum 3999, minimum 1
        if (number > 3999 || number < 1) return null;
        String roman = "";
        // untergruppen
        int einer = number % 10;
        number = number - einer;
        int zehner = number % 100;
        number = number - zehner;
        int hunderter = number % 1000;
        int tausender = number - hunderter;

        // tausender evaluieren
        tausender = tausender / 1000;
        for (int i = 0; i < tausender; i++) {
            roman = roman.concat("M");
        }

        // Hunderter
        hunderter = hunderter / 100;
        if (hunderter == 0) {
            // do nothing
        } else if (hunderter <= 3) {
            for (int i = 0; i < hunderter; i++) {
                roman = roman.concat("C");
            }
        } else if (hunderter == 4) {
            roman = roman.concat("CD");
        } else if (hunderter <= 8) {
            roman = roman.concat("D");
            hunderter = hunderter - 5;
            for (int i = 0; i < hunderter; i++) {
                roman = roman.concat("C");
            }
        } else { // == 9
            roman = roman.concat("CM");
        }

        zehner = zehner / 10;
        if (zehner == 0) {
            // do nothing
        } else if (zehner <= 3) {
            for (int i = 0; i < zehner; i++) {
                roman = roman.concat("X");
            }
        } else if (zehner == 4) {
            roman = roman.concat("XL");
        } else if (zehner <= 8) {
            roman = roman.concat("L");
            zehner = zehner - 5;
            for (int i = 0; i < zehner; i++) {
                roman = roman.concat("X");
            }
        } else { // == 9
            roman = roman.concat("XC");
        }

        if (einer == 0) {
            // do nothing
        } else if (einer <= 3) {
            for (int i = 0; i < einer; i++) {
                roman = roman.concat("I");
            }
        } else if (einer == 4) {
            roman = roman.concat("IV");
        } else if (einer <= 8) {
            roman = roman.concat("V");
            einer = einer - 5;
            for (int i = 0; i < einer; i++) {
                roman = roman.concat("I");
            }
        } else { // == 9
            roman = roman.concat("IX");
        }
        return roman;
    }

    String turnIntToRomanNumeralA(int number) {
        System.out.print(number + ": ");
        String roman = "";
        String[][] roemischeZahlen = new String[][]{
                new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX","X"},
                new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"},
                new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"},
                new String[]{"","M","MM","MMM"}};
        int i = 10;
        for (String[] arr : roemischeZahlen) { // einer, zehner, hunderter und tausender einzeln
            int numberMod = number % i;
            roman = arr[numberMod].concat(roman);
            number = (number-numberMod) / 10;
        }
        System.out.println(roman);
        return roman;
    }
}