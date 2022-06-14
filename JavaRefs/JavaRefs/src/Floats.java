public class Floats {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent a float value: " + Float.BYTES);
        System.out.println("Number of bits to represent a float value: " + Float.SIZE);
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);
        System.out.println("Smallest value of normal float: " + Float.MIN_NORMAL);
        System.out.println("Min Exponent: " + Float.MIN_EXPONENT);
        System.out.println("Max Exponent: " + Float.MAX_EXPONENT);
        System.out.println("NaN: " + Float.NaN);
        System.out.println("Neg Inf: " + Float.NEGATIVE_INFINITY);
        System.out.println("Pos Inf: " + Float.POSITIVE_INFINITY);
        System.out.println("Type: " + Float.TYPE);
        System.out.println();

        // No default constructors
        float first = 123.213f;
        float second = -12344.237f;

        System.out.println("Parse Long: " + Float.parseFloat("6969.69696"));
        System.out.println("Count number of bits used to represent first as int: " + Float.floatToIntBits(first));
        System.out.println("Count number of bits used to represent first as raw int: " + Float.floatToRawIntBits(first));
        System.out.println("Convert int bits to float: " + Float.intBitsToFloat(100));
        System.out.println("Compare second with first: " + Float.compare(second, first));
        System.out.println("Comparing first to second: " + Float.compare(first, second));
        System.out.println("Check if is infinite: " + Float.isInfinite(first));
        System.out.println("Check if is finite: " + Float.isFinite(first));
        System.out.println("Check if is NaN: " + Float.isNaN(first));
        System.out.println("Min between 2 float: " + Float.min(first, second));
        System.out.println("Max between 2 float: " + Float.max(first, second));
        System.out.println("Sum of 2 Floats: " + Float.sum(first, second));
        System.out.println("Hex String: " + Float.toHexString(first));
        System.out.println("String value: " + Float.toString(first));
        System.out.println("Value of first, second: " + Float.valueOf(first) + ", " + Float.valueOf(second));
        System.out.println("Value converted from string: " + Float.valueOf("123"));
        System.out.println("Hashcode of first: " + Float.hashCode(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Integer: " + (int) first);
        System.out.println("Cast to Double: " + (double) first);
        System.out.println("Cast to Short: " + (short) first);
        System.out.println("Cast to Long: " + (long) first);
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

        // Operators
        System.out.println("+: " + (first + second));
        System.out.println("-: " + (first - second));
        System.out.println("*: " + (first * second));
        System.out.println("/: " + (first / second));
        System.out.println("%: " + (first % second));
    }
}
