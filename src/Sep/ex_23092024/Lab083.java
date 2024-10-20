package Sep.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        // jdk
        int itemcode = 006;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("this is Mech");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
