import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Using HashMap to manage character banner patterns
 * @author Aritra
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    private static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        map.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }
}