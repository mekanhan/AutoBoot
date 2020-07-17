package DiagnosticTest;

public class q31 {
    public static void main(String[] args) {
        final int x=0;
        final int y=2;

        switch (x*y) { //try: x+y, x-y
            case x: {
                System.out.println("A");
            }
            case 1:
                System.out.println("B");
            default:
                System.out.println("default");
                break;
            case y:
                System.out.println("C");
        }
    }
}

