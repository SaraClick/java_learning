package variables;

public class Runner {
    public static void main(String[] args) {
//        Maximum values for each whole numbers (primitive data type):
        byte b = 127;
        short s = 246;
        int i = 210_000_000;
        long l = 999999999L; // note the L at the end to indicate is a long so JAVA knows is not an integer


//        Decimal numbers (primitive data types)
        float f = 589.56F;  // float is more efficient than double. We must add F at the end otherwise it thinks is a double
        double d = 999999999.999999999;  // long float


//        Booleans:
        boolean bool = true;


//        Text:
        char c = 'j';
//        We can use either literal or the new key. There are differences in terms of memory but this will be discussed later on
        String stringLiteral = "Hello!"; // String - non-primitive, this is actually an object
        String string = new String("I am an object");
        String s1 = "\"Using scape characters\"";


//        NAMING CONVENTION:
//        variableNames are camelCase
//        ClassNames are PascalCase

        int x = 3, y = 5;
        System.out.println(x+y);


    }
}
