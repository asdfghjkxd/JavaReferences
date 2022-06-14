public class Longs {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent a long value: " + Long.BYTES);
        System.out.println("Number of bits to represent a long value: " + Long.SIZE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);
        System.out.println("Type: " + Long.TYPE);
        System.out.println();

        // No default constructors
        long first = 123423423;
        long second = -12344232;

        System.out.println("Parse Long: " + Long.parseLong("6969"));
        System.out.println("Parse unsigned Long: " + Long.parseUnsignedLong("928"));
        System.out.println("Count number of bits used to represent first: " + Long.bitCount(first));
        System.out.println("Compare second with first: " + Long.compare(second, first));
        System.out.println("Comparing first to second (first, second are unsigned): " +
                Long.compareUnsigned(first, second));
        System.out.println("Decode String to short: " + Long.decode("-2342342369"));
        System.out.println("Divide 2 integers and return unsigned quotient: " + Long.divideUnsigned(first, second));
        System.out.println("Divide 2 integers and return unsigned remainder: " + Long.remainderUnsigned(first, second));
        System.out.println("Lowest One bit (rightmost bit): " + Long.lowestOneBit(first));
        System.out.println("Highest One bit (rightmost bit): " + Long.highestOneBit(first));
        System.out.println("Min between 2 longs: " + Long.min(first, second));
        System.out.println("Max between 2 longs: " + Long.max(first, second));
        System.out.println("Number of leading zeros: " + Long.numberOfLeadingZeros(first));
        System.out.println("Number of trailing zeros: " + Long.numberOfTrailingZeros(first));
        System.out.println("Reverse the order of the bits in the two complement representation of the " +
                "int value: " + Long.reverse(first));
        System.out.println("Reverse the order of the bytes in the two complement representation of the " +
                "int value: " + Long.reverseBytes(first));
        System.out.println("Rotate (left) 2 complementary binary representation of int by number of bits: " +
                Long.rotateLeft(first, 1));
        System.out.println("Rotate (left) 2 complementary binary representation of int by number of bits: " +
                Long.rotateRight(first, 1));
        System.out.println("Signum function of int value: " + Long.signum(first));
        System.out.println("Sum of 2 Longs: " + Long.sum(first, second));
        System.out.println("Binary String: " + Long.toBinaryString(first));
        System.out.println("Hex String: " + Long.toHexString(first));
        System.out.println("Octal String: " + Long.toOctalString(first));
        System.out.println("String Value: " + Long.toBinaryString(first));
        System.out.println("Unsigned String Value: " + Long.toUnsignedString(first));
        System.out.println("Value of first, second: " + Long.valueOf(first) + ", " + Long.valueOf(second));
        System.out.println("Value converted from string: " + Long.valueOf("123"));
        System.out.println("Hashcode of first: " + Long.hashCode(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Integer: " + (int) first);
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
