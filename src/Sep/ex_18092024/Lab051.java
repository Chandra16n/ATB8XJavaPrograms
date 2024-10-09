package Sep.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 7250647411l;
        // Short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s = (short) phone_no; // Narrowing - Explicit - Loss // Invalid


    }
}
