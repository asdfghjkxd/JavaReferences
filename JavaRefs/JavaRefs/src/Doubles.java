public class Doubles {
    public static void main(String[] args) {
        System.out.println("Number of bytes to represent a double value: " + Double.BYTES);
        System.out.println("Number of bits to represent a double value: " + Double.SIZE);
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);
        System.out.println("Smallest value of normal double: " + Double.MIN_NORMAL);
        System.out.println("Min Exponent: " + Double.MIN_EXPONENT);
        System.out.println("Max Exponent: " + Double.MAX_EXPONENT);
        System.out.println("NaN: " + Double.NaN);
        System.out.println("Neg Inf: " + Double.NEGATIVE_INFINITY);
        System.out.println("Pos Inf: " + Double.POSITIVE_INFINITY);
        System.out.println("Type: " + Double.TYPE);
        System.out.println();

        // No default constructors
        double first = 123.232452345454313d;
        double second = -12344534.23453453437d;

        System.out.println("Parse Long: " + Double.parseDouble("-6969.69696"));
        System.out.println("Count number of bits used to represent first as long: " + Double.doubleToLongBits(first));
        System.out.println("Count number of bits used to represent first as raw long: " + Double.doubleToRawLongBits(first));
        System.out.println("Convert long bits to double: " + Double.longBitsToDouble(100));
        System.out.println("Compare second with first: " + Double.compare(second, first));
        System.out.println("Comparing first to second: " + Double.compare(first, second));
        System.out.println("Check if is infinite: " + Double.isInfinite(first));
        System.out.println("Check if is finite: " + Double.isFinite(first));
        System.out.println("Check if is NaN: " + Double.isNaN(first));
        System.out.println("Min between 2 double: " + Double.min(first, second));
        System.out.println("Max between 2 double: " + Double.max(first, second));
        System.out.println("Sum of 2 doubles: " + Double.sum(first, second));
        System.out.println("Hex String: " + Double.toHexString(first));
        System.out.println("String value: " + Double.toString(first));
        System.out.println("Value of first, second: " + Double.valueOf(first) + ", " + Double.valueOf(second));
        System.out.println("Value converted from string: " + Double.valueOf("123"));
        System.out.println("Hashcode of first: " + Double.hashCode(first));
        System.out.println();

        // Casting
        System.out.println("Cast to Integer: " + (int) first);
        System.out.println("Cast to Float: " + (float) first);
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
