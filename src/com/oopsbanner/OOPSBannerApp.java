package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

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
          feature/UC7_CharacterPatternClass

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
        Map<Character, String[]> patternMap = createPatternMap();
        String word = "OOPS";
        printBanner(word, patternMap);
    }

    static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patternMap;
    }

    static void printBanner(String word, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("         ");
                }
            }
            System.out.println();
          main
        }
    }
}