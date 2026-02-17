/**
 * OOPSBannerApp
 * UC4: Improved OOPS banner using String array and loop
 * Circular O and clear S shape
 * 
 * @author Aritra
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("   ",
                " ***** ",
                " ***** ",
                "****** ",
                " ***** "),

            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"),

            String.join("   ",
                "*     *",
                "*     *",
                "****** ",
                "*      "),

            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                " ***** "),

            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *"),

            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"),

            String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
