public class Ints {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent an int value: " + Integer.BYTES);
        System.out.println("Number of bits to represent an int value: " + Integer.SIZE);
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println("Type: " + Integer.TYPE);
        System.out.println();

        // No default constructors
        int first = 123;
        int second = -12;

        System.out.println("Parse Int: " + Integer.parseInt("6969"));
        System.out.println("Parse unsigned Int: " + Integer.parseUnsignedInt("928"));
        System.out.println("Count number of bits used to represent first: " + Integer.bitCount(first));
        System.out.println("Compare second with first: " + Integer.compare(second, first));
        System.out.println("Comparing first to second (first, second are unsigned): " +
                Integer.compareUnsigned(first, second));
        System.out.println("Decode String to short: " + Integer.decode("69"));
        System.out.println("Divide 2 integers and return unsigned quotient: " + Integer.divideUnsigned(first, second));
        System.out.println("Divide 2 integers and return unsigned remainder: " + Integer.remainderUnsigned(first, second));
        System.out.println("Lowest One bit (rightmost bit): " + Integer.lowestOneBit(first));
        System.out.println("Highest One bit (rightmost bit): " + Integer.highestOneBit(first));
        System.out.println("Min between 2 ints: " + Integer.min(first, second));
        System.out.println("Max between 2 ints: " + Integer.max(first, second));
        System.out.println("Number of leading zeros: " + Integer.numberOfLeadingZeros(first));
        System.out.println("Number of trailing zeros: " + Integer.numberOfTrailingZeros(first));
        System.out.println("Reverse the order of the bits in the two complement representation of the " +
                "int value: " + Integer.reverse(first));
        System.out.println("Reverse the order of the bytes in the two complement representation of the " +
                "int value: " + Integer.reverseBytes(first));
        System.out.println("Rotate (left) 2 complementary binary representation of int by number of bits: " +
                Integer.rotateLeft(first, 1));
        System.out.println("Rotate (left) 2 complementary binary representation of int by number of bits: " +
                Integer.rotateRight(first, 1));
        System.out.println("Signum function of int value: " + Integer.signum(first));
        System.out.println("Sum of 2 Integers: " + Integer.sum(first, second));
        System.out.println("Binary String: " + Integer.toBinaryString(first));
        System.out.println("Hex String: " + Integer.toHexString(first));
        System.out.println("Octal String: " + Integer.toOctalString(first));
        System.out.println("String Value: " + Integer.toBinaryString(first));
        System.out.println("Unsigned Long Value: " + Integer.toUnsignedLong(first));
        System.out.println("Unsigned String Value: " + Integer.toUnsignedString(first));
        System.out.println("Value of first, second: " + Integer.valueOf(first) + ", " + Integer.valueOf(second));
        System.out.println("Value converted from string: " + Integer.valueOf("123"));
        System.out.println("Hashcode of first: " + Integer.hashCode(first));

        System.out.println();

        // Casting
        System.out.println("Cast to Long: " + (long) first);
        System.out.println("Cast to Double: " + (double) first);
        System.out.println("Cast to Short: " + (short) first);
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
