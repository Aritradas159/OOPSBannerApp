/**
 * OOPSBannerApp
 * UC5: OOPS Banner using inline array initialization,
 * String.join() and enhanced for-loop.
 * 
 * @author Aritra
 * @version 5.0
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