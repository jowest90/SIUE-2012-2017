/*    File: StringFormat.java
 *    Name: John West
 *    Revised: 6/18/2013
 *    Course: CS150 - Introduction to Computing II - Summer 13
 * 
 *    Desc: This program ...Uses GUI and Java Class implementation.
 */
package hw02;

/**
 *
 * @author Johnny
 */
public class StringFormat {

    private String text;

    public StringFormat() {
        this("na");
    }

    public StringFormat(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toUpperCase() {
        return text.toUpperCase();
    }

    public String toLowerCase() {
        return text.toLowerCase();
    }

    public String wordCapitalize() {
        char[] chars = text.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public int wordCount() {
        String[] words = text.split(" |\n");
        return words.length;
    }

    public int alphabeticCharCount() {
        int alphabeticCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (c != ';') {
                    if (c != '.') {
                        alphabeticCount++;
                    }
                }
            }
        }
        return alphabeticCount;

    }

    public int spaceCharCount() {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public int punctuationCharCount() {
        int punCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == ',' || c == '?' || c == ';' || c == ':' || c == '!' || c == '@' || c == '#'
                    || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')') {
                punCount++;
            }
        }
        return punCount;
    }

    @Override
    public String toString() {
        return "StringFormat{" + "text=" + text + '}';
    }
}
