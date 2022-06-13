public class Bool {
    public static void main(String[] args) {
        boolean False = false;
        boolean True = true;

        System.out.println("FALSE Value: " + Boolean.FALSE);
        System.out.println("TRUE Value: " + Boolean.TRUE);
        System.out.println("Type: " + Boolean.TYPE);
        System.out.println();

        System.out.println("Parse String to Boolean: " + Boolean.parseBoolean("false") + ", " +
                Boolean.parseBoolean("true"));
        System.out.println("Compare booleans: " + Boolean.compare(False, True));
        System.out.println("Logical And: " + Boolean.logicalAnd(False, True));
        System.out.println("Logical Or: " + Boolean.logicalOr(False, True));
        System.out.println("Logical Exclusive Or: " + Boolean.logicalXor(False, True));
        System.out.println("Returns value of boolean: " + Boolean.valueOf(False) + ", " + Boolean.valueOf(True));
        System.out.println("Returns boolean representation of string value: " +
                Boolean.valueOf("false") + ", " + Boolean.valueOf("true"));
        System.out.println("Convert to String: " + Boolean.toString(False) + ", " + Boolean.toString(True));
        System.out.println("False, True hashcodes: " + Boolean.hashCode(False) + ", " + Boolean.hashCode(True));
        System.out.println();

        // Casting
        System.out.println("Cast to String: " + False);
        System.out.println();

        // Comparator
        System.out.println("!=: " + (False != True));
        System.out.println("&& : " + (False && True));
        System.out.println("|| : " + (False || True));
        System.out.println();

        // Unary Operators
        System.out.println("&: " + (False & True));
        System.out.println("|: " + (False | True));
        System.out.println("^: " + (False ^ True));
        System.out.println();
    }
}
