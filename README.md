# Java References


```Java
import java.lang.*
```

## Basic Data Types

### Bytes


```Java
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


Bytes bytes = new Bytes();
bytes.main(new String[1]);
```

    Number of bytes to represent a byte value: 1
    Number of bits to represent a byte value: 8
    Min: -128
    Max: 127
    Type: byte
    
    Parsing -123 and 127 into bytes: -123, 127
    Decode String to byte: 69
    Byte Value of first: -123
    Byte Value of second: 127
    Compare first with second: -250
    Comparing first to second (first, second are unsigned): 6
    Unsigned Int Value: 133
    Unsigned Float Value: 133
    String Value: -123
    Value of first, second: -123, 127
    Hashcode of first: -123
    
    Cast to Int: -123
    Cast to Long: -123
    Cast to Short: -123
    Cast to Double: -123.0
    Cast to Float: -123.0
    Cast to String: -123
    
    <: true
    >: false
    <=: true
    >=: false
    !=: true
    
    &: 5
    |: -1
    
    +: 4
    -: -250
    *: -15621
    /: 0
    %: -123
    

### Boolean


```Java
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

Bool bool = new Bool();
bool.main(new String[1]);
```

    FALSE Value: false
    TRUE Value: true
    Type: boolean
    
    Parse String to Boolean: false, true
    Compare booleans: -1
    Logical And: false
    Logical Or: true
    Logical Exclusive Or: true
    Returns value of boolean: false, true
    Returns boolean representation of string value: false, true
    Convert to String: false, true
    False, True hashcodes: 1237, 1231
    
    Cast to String: false
    
    !=: true
    && : false
    || : true
    
    &: false
    |: true
    ^: true
    
    

### Short


```Java
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

Shorts shorts = new Shorts();
shorts.main(new String[1]);
```

    Number of bytes to represent a short value: 2
    Number of bits to represent a short value: 16
    Min: -32768
    Max: 32767
    Type: short
    
    Parsing strings -21 and 12 into short: -21, 12
    Decode String to short: 69
    Short Value of first: -21
    Short Value of second: 12
    Compare second with first: 33
    Comparing first to second (first, second are unsigned): 65503
    Unsigned Int Value: 65515
    Unsigned Float Value: 65515
    String Value: -21
    Value of first, second: -21, 12
    Value converted from string: 123
    Hashcode of first: -21
    Reverse the order of the bytes in the two complement representation of the short value: -5121
    
    Cast to Int: -21
    Cast to Long: -21
    Cast to Double: -21.0
    Cast to Float: -21.0
    Cast to String: -21
    
    <: true
    >: false
    <=: true
    >=: false
    !=: true
    
    &: 8
    |: -17
    ^: -25
    
    +: -9
    -: -33
    *: -252
    /: -1
    %: -9
    


```Java

```
