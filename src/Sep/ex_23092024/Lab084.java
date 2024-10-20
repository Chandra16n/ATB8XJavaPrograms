package Sep.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 001; // JDK 13

        switch (itemcode) {
            case 001 -> System.out.println("it is a laptop");
            case 002 -> System.out.println("it is a desktop");
            case 003 -> System.out.println("it is a Mobile phone");
            default -> System.out.println("hello ");
        }
    }
}
