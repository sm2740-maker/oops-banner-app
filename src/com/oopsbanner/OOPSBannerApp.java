package com.oopsbanner;

/**
 * UC1: Print OOPS to console
 * @author Shayon Mazumder
 * @version 1.0
 */
public class OOPSBannerApp {

    // Static inner class to store character and its banner pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects for O, P, and S
        CharacterPatternMap[] patternMaps = {
            new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),
            new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
            }),
            new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            })
        };

        String word = "OOPS";

        // Print banner line by line
        for (int line = 0; line < 7; line++) {
            StringBuilder outputLine = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);

                for (CharacterPatternMap map : patternMaps) {
                    if (map.getCharacter() == currentChar) {
                        outputLine.append(map.getPattern()[line]).append("  ");
                        break;
                    }
                }
            }

            System.out.println(outputLine);
        }
    }
}