public class Shorts {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent a short value: " + Short.BYTES);
        System.out.println("Number of bits to represent a short value: " + Short.SIZE);
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);
        System.out.println("Type: " + Short.TYPE);
        System.out.println();

        // No default constructors
        short first = Short.parseShort("-21");
        short second = Short.parseShort("12");

        System.out.println("Parsing strings -21 and 12 into short: " + first + ", " + second);
        System.out.println("Decode String to short: " + Short.decode("69"));
        System.out.println("Short Value of first: " + first);
        System.out.println("Short Value of second: " + second);
        System.out.println("Compare second with first: " + Short.compare(second, first));
        // Overflow occurs since it is unsigned
        System.out.println("Comparing first to second (first, second are unsigned): " +
                Short.compareUnsigned(first, second));
        // Overflow occurs since it is unsigned
        System.out.println("Unsigned Int Value: " + Short.toUnsignedInt(first));
        System.out.println("Unsigned Float Value: " + Short.toUnsignedLong(first));
        System.out.println("String Value: " + Short.toString(first));
        System.out.println("Value of first, second: " + Short.valueOf(first) + ", " + Short.valueOf(second));
        System.out.println("Value converted from string: " + Short.valueOf("123"));
        System.out.println("Hashcode of first: " + Short.hashCode(first));
        System.out.println("Reverse the order of the bytes in the two complement representation of the " +
                "short value: " + Short.reverseBytes(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Int: " + (int) first);
        System.out.println("Cast to Long: " + (long) first);
        System.out.println("Cast to Double: " + (double) first);
        System.out.println("Cast to Float: " + (float) first);
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
