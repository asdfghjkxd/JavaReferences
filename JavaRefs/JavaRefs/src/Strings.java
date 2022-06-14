import java.nio.charset.StandardCharsets;

public class Strings {
    public static void main(String[] args) {
        // Constructors
        byte[] bytes = new byte[]{(byte) 1, (byte) 2};
        char[] chars = new char[]{'A', 'z'};
        int[] ints = new int[]{65, 64};

        String byteStr = new String(bytes);
        String charStr = new String(chars);
        String intStr = new String(ints, 0, 2);
        String normalString = "This is a normal String";

        System.out.println("String from byte array: " + byteStr);
        System.out.println("String from char array: " + charStr);
        System.out.println("String from int array: " + intStr);
        System.out.println();

        // Methods
        System.out.println("Char at: " + normalString.charAt(2));
        System.out.println("Code point at: " + normalString.codePointAt(2));
        System.out.println("Code point before: " + normalString.codePointBefore(2));
        System.out.println("Code point count: " + normalString.codePointCount(0, 2));
        System.out.println("Compare to: " + normalString.compareTo(byteStr));
        System.out.println("Compare to (ignore case): " + normalString.compareToIgnoreCase(byteStr));
        System.out.println("Concat strings: " + normalString.concat(byteStr));
        System.out.println("Copy String: " + String.copyValueOf(new char[] {'A', 'B', 'C'}));
        System.out.println("Ends with: " + normalString.endsWith("g"));
        System.out.println("Starts with: " + normalString.startsWith("T"));
        System.out.println("Equals: " + normalString.equals(byteStr));
        System.out.println("Equals (Ignore case): " + normalString.equalsIgnoreCase(byteStr));
        char[] temp = new char[10];
        normalString.getChars(0, 10, temp, 0);
        System.out.println("Get Chars: " + temp.toString());
        System.out.println("Index of: " + normalString.indexOf('T'));
        System.out.println("Last Index of (char): " + normalString.lastIndexOf('T'));
        System.out.println("Last Index of (string): " + normalString.lastIndexOf("Th"));
        System.out.println("Index of (from index): " + normalString.indexOf('S', 9));
        System.out.println("Intern: " + normalString.intern());
        System.out.println("Is Blank: " + normalString.isBlank());
        System.out.println("Is Empty: " + normalString.isEmpty());
        System.out.println("Length: " + normalString.length());
        System.out.println("Offset by code points: " + normalString.offsetByCodePoints(0, 9));
        System.out.println("Check if region of string are equal: " + normalString.regionMatches(0, byteStr, 0, 10));
        System.out.println("String duplication and concatenation (A * 5 in python): " + normalString.repeat(2));
        System.out.println("Replace char in string: " + normalString.replace('T', 'A'));
        System.out.println("Strip whitespaces: " + "    stripped      ".strip());
        System.out.println("Strip leading whitespaces: " + "    stripped      ".stripLeading());
        System.out.println("Strip trailing whitespaces: " + "    stripped      ".stripTrailing());
        System.out.println("Trim string (remove whitespaces and convert codepoints): " +
                "    stripped      ".trim());
        System.out.println("Subsequence: " + normalString.subSequence(0, 10));
        System.out.println("Substring: " + normalString.substring(3));
        System.out.println("Substring: " + normalString.substring(0, 10));
        System.out.println("Convert to char array: " + normalString.toCharArray());
        System.out.println("Convert to lower case: " + normalString.toLowerCase());
        System.out.println("Convert to upper case: " + normalString.toUpperCase());
        System.out.println("Convert to string: " + normalString.toString());
        System.out.println();

        // Conversion
        System.out.println("Boolean: " + String.valueOf(false));
        System.out.println("Char: " + String.valueOf('A'));
        System.out.println("Char Array: " + String.valueOf(new char[]{'A', 'B'}));
        System.out.println("Double: " + String.valueOf(9213.3124d));
        System.out.println("Float: " + String.valueOf(123.34f));
        System.out.println("Integer: " + String.valueOf(123));
        System.out.println("Long: " + String.valueOf(12341423453254L));

        // Find hashcode
        System.out.println("Hashcode: " + normalString.hashCode());

        // Comparator (not a
        System.out.println("!=: " + (normalString != byteStr));
        System.out.println();

        // Operators
        System.out.println("+: " + (normalString + byteStr));
    }
}
