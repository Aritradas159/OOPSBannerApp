/**
 * OOPSBannerApp
 * UC6: Modular Banner using Helper Methods
 * Uses static methods to generate patterns for O, P and S
 * 
 * @author Aritra
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] letterO = getO();
        String[] letterP = getP();
        String[] letterS = getS();

        // O O P S
        for (int i = 0; i < letterO.length; i++) {
            System.out.println(
                    letterO[i] + "   " +
                    letterO[i] + "   " +
                    letterP[i] + "   " +
                    letterS[i]
            );
        }
    }

    // Method to generate O pattern
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate P pattern
    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method to generate S pattern
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}