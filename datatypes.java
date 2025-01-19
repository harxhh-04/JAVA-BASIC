public class datatypes {
    public static void main(String[] args) {
        System.out.println("Default values and sizes of primitive data types in Java:");
        
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0L;
        float floatValue = 0.0f;
        double doubleValue = 0.0d;
        char charValue = '\u0000'; // default char value
        boolean booleanValue = false;

        System.out.println("byte: " + byteValue + ", Size: " + Byte.BYTES + " bytes");
        System.out.println("short: " + shortValue + ", Size: " + Short.BYTES + " bytes");
        System.out.println("int: " + intValue + ", Size: " + Integer.BYTES + " bytes");
        System.out.println("long: " + longValue + ", Size: " + Long.BYTES + " bytes");
        System.out.println("float: " + floatValue + ", Size: " + Float.BYTES + " bytes");
        System.out.println("double: " + doubleValue + ", Size: " + Double.BYTES + " bytes");
        System.out.println("char: " + charValue + ", Size: " + Character.BYTES + " bytes");
        System.out.println("boolean: " + booleanValue + ", Size: " + 1 + " byte (not precisely defined)");
    }
}
