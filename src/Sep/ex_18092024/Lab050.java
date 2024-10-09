package Sep.ex_18092024;

public class Lab050 {
    public static void main(String[] args ) {
        // Typing Casting
        // widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit( with data type )- loss

        // Widening
        byte b = 10 ;
        int a = b; // valid - implicit Casting - jvm
        int a1 = (int) b; // Valid - Explicit Casting - JVM

        // Narrowing
        int val = 300;
        // byte b1 = val ; // Invalid - implicit Casting - jvm
        byte b2 = (byte) val ; // inValid - Explicit Casting - JVM
        System.out.println(b2);


    }
}
