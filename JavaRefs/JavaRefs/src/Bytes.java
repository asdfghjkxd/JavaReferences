public class Bytes {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent a byte value: " + Byte.BYTES);
        System.out.println("Number of bits to represent a byte value: " + Byte.SIZE);
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println("Max: " + Byte.MAX_VALUE);
        System.out.println("Type: " + Byte.TYPE);
        System.out.println();

        // No default constructors
        byte first = Byte.parseByte("-123");
        byte second = Byte.parseByte("127");

        System.out.println("Parsing -123 and 127 into bytes: " + first + ", " + second);
        System.out.println("Decode String to byte: " + Byte.decode("69"));
        System.out.println("Byte Value of first: " + first);
        System.out.println("Byte Value of second: " + second);
        System.out.println("Compare first with second: " + Byte.compare(first, second));
        System.out.println("Comparing first to second (first, second are unsigned): " +
                Byte.compareUnsigned(first, second));
        System.out.println("Unsigned Int Value: " + Byte.toUnsignedInt(first));
        System.out.println("Unsigned Float Value: " + Byte.toUnsignedLong(first));
        System.out.println("String Value: " + Byte.toString(first));
        System.out.println("Value of first, second: " + Byte.valueOf(first) + ", " + Byte.valueOf(second));
        System.out.println("Hashcode of first: " + Byte.hashCode(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Int: " + (int) first);
        System.out.println("Cast to Long: " + (long) first);
        System.out.println("Cast to Short: " + (short) first);
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
        System.out.println();

        // Operators
        System.out.println("+: " + (first + second));
        System.out.println("-: " + (first - second));
        System.out.println("*: " + (first * second));
        System.out.println("/: " + (first / second));
        System.out.println("%: " + (first % second));
    }
}
