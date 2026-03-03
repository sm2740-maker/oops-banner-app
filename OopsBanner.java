public class OopsBanner {

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
    }
}