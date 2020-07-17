package DiagnosticTest;

public class q8 {
    public static void main(String [ ] args) {
        // new Program().doIt();
        // new Program().didIt(); ...ClassNotFoundException

    }

    static void doIt()throws java.io.IOException {
        throw new java.io.IOException();
    }

    static void didIt()throws ClassNotFoundException{
        throw new SecurityException();
    }
}
