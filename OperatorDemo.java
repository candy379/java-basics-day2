public class OperatorDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));
        System.out.println("(a > b || b > 10) = " + (a > b || b > 10));
        System.out.println("!(a > b) = " + !(a > b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        c += b;
        System.out.println("c += b : " + c);
        c -= b;
        System.out.println("c -= b : " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
    }
}
