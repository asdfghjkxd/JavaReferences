public class Chars {
    public static void main(String[] args) {
        // Other stuff about unicode specs is not included
        System.out.println("Number of bytes to represent a char value: " + Character.BYTES);
        System.out.println("Number of bits to represent a char value: " + Character.SIZE);
        System.out.println("Min: " + Character.MIN_VALUE);
        System.out.println("Max: " + Character.MAX_VALUE);
        System.out.println("Type: " + Character.TYPE);
        System.out.println("Max Radix: " + Character.MAX_RADIX);
        System.out.println("Min Radix: " + Character.MIN_RADIX);
        System.out.println();

        char first = 'A';
        char second = 'z';
        char[] third = new char[]{'A', 'b', 'c', '?'};

        System.out.println("Number of char values represent char: " + Character.charCount(first));
        System.out.println("Code point from char: " + Character.toCodePoint(first, second));
        System.out.println("Code point (ASCII value) in char array: " + Character.codePointAt(third, 0));
        System.out.println("Code point at (ASCII value) in char array with limits: " + Character.codePointAt(third, 0, 1));
        System.out.println("Code point before (ASCII value) in char array with limits: " + Character.codePointBefore(third, 2));
        System.out.println("Code point count (ASCII value) in char array: " + Character.codePointCount(third, 0, 1));
        System.out.println("Compare chars: " + Character.compare(first, second));
        System.out.println("Digit (Numeric value of char in specific radix): " + Character.digit(first, 0));
        System.out.println("Digit (Code Point in specific radix): " + Character.digit(65, 0));
        System.out.println("Char representation of specific digit in radix: " + Character.forDigit(65, 0));
        System.out.println("Directional Property of Char: " + Character.getDirectionality(first));
        System.out.println("Directional Property of Code point: " + Character.getDirectionality(65));
        System.out.println("Numerical Value of char: " + Character.getNumericValue(first));
        System.out.println("Numerical Value of code point: " + Character.getNumericValue(12));
        System.out.println("Type of char: " + Character.getType(first));
        System.out.println("Type of code point: " + Character.getType(65));
        System.out.println("Hashcode: " + Character.hashCode(first));
        System.out.println();

        // all works with code points idk
        System.out.println("Is Alphabetic: " + Character.isAlphabetic(first));
        System.out.println("Is Digit: " + Character.isDigit(first));
        System.out.println("Is Letter: " + Character.isLetter(first));
        System.out.println("Is Letter or Digit: " + Character.isLetterOrDigit(first));
        System.out.println("Is Lower Case: " + Character.isLowerCase(first));
        System.out.println("To Lower Case: " + Character.toLowerCase(first));
        System.out.println("Is Title Case: " + Character.isTitleCase(first));
        System.out.println("To Title Case: " + Character.toTitleCase(first));
        System.out.println("Is Upper Case: " + Character.isUpperCase(first));
        System.out.println("To Upper Case: " + Character.toUpperCase(first));
        System.out.println("Is Space Char: " + Character.isSpaceChar(first));
        System.out.println("Is Whitespace Char: " + Character.isWhitespace(first));
        System.out.println("Reverse Bytes: " + Character.reverseBytes(first));
        System.out.println("Convert to String: " + Character.toString(first));
        System.out.println("Value of: " + Character.valueOf(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Int: " + (int) first);
        System.out.println("Cast to Long: " + (long) first);
        System.out.println("Cast to Double: " + (double) first);
        System.out.println("Cast to Float: " + (float) first);
        System.out.println("Cast to Byte: " + (byte) first);
        System.out.println("Cast to String: " + first);
        System.out.println();

        // Comparator
        System.out.println("<: " + (first < second));
        System.out.println(">: " + (first > second));
        System.out.println("<=: " + (first <= second));
        System.out.println(">=: " + (first >= second));
        System.out.println("!=: " + (first != second));
        System.out.println();

        // Unary Operators
        System.out.println("&: " + (first & second));
        System.out.println("|: " + (first | second));
        System.out.println("^: " + (first ^ second));
        System.out.println();

        // Operators
        System.out.println("+: " + (first + second));
        System.out.println("-: " + (first - second));
        System.out.println("*: " + (first * second));
        System.out.println("/: " + (first / second));
        System.out.println("%: " + (first % second));
    }
}
