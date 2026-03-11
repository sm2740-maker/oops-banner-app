 feature/UC7_CharacterPatternClass
    feature/UC4_StringArrayLoop
public class OopsBanner {

        feature/UC6_MethodBasedBanner
    // UC6: Helper method to build 'O' pattern (7 lines)
    static String[] buildO() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** ")
        };
    }

    // UC6: Helper method to build 'P' pattern (7 lines)
    static String[] buildP() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** "),
                String.join("", "*      "),
                String.join("", "*      "),
                String.join("", "*      ")
        };
    }

    // UC6: Helper method to build 'S' pattern (7 lines)
    static String[] buildS() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*      "),
                String.join("", " ***** "),
                String.join("", "      *"),
                String.join("", "*     *"),
                String.join("", " ***** ")
        };
    }

    // Combines O O P S line-by-line into final 7 banner lines
    static String[] buildBannerLines() {
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }
        return banner;
    }

    public static void main(String[] args) {
        // UC6: Array declaration + method call
        String[] bannerLines = buildBannerLines();

        // Enhanced for loop rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
        String[] bannerLines = {
                String.join("", " *****    ", " *****   ", " *****   ", " ***** "),
                String.join("", "*     *  ", "*     * ", "*     * ", "*     *"),
                String.join("", "*     *  ", "*     * ", "*     * ", "*      "),
                String.join("", "*     *  ", "*     * ", "*     * ", "*      "),
                String.join("", "*     *  ", "*     * ", "*     * ", "*      "),
                String.join("", "*     *  ", "*     * ", "*     * ", "*     *"),
                String.join("", " *****    ", " *****   ", " *****   ", " ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
      feature/UC5_ArrayInit_StringJoin
public class OOPSBannerApp {
    public static void main(String[] args) {

       feature/UC3_StringJoin
        String line1 = String.join("", 
                "  *****   ", " *****   ", " *****   ", " *****  ");
        String line2 = String.join("", 
                " *     *  ", "*     *  ", "*     *  ", "*     * ");
        String line3 = String.join("", 
                "*       * ", "*       * ", "*       * ", "*       *");
        String line4 = String.join("", 
                "*       * ", "*       * ", " *****   ", " *****  ");
        String line5 = String.join("", 
                "*       * ", "*       * ", "*        ", "     *  ");
        String line6 = String.join("", 
                " *     *  ", "*     *  ", "*     *  ", "*     * ");
        String line7 = String.join("", 
                "  *****   ", " *****   ", " *****   ", " *****  ");
        System.out.println(" *****   *****  *****   ***** ");
        System.out.println("*     * *     * *    * *     *");
        System.out.println("*     * *     * *    * *      ");
        System.out.println("*     * *     * *****   ***** ");
        System.out.println("*     * *     * *            *");
        System.out.println("*     * *     * *            *");
        System.out.println(" *****   *****  *       ****** ");
        main
        main

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        main
        main
    }
}
main
