package DiagnosticTest;

public class q66 {
    public static void main(String args [ ]) {
        String [ ]x = {"A","B","C","D","E"};

        nxt(x);
        for(String s : x)
            System.out.print(s+" ");
    }

    static void nxt(Object obj) {
        String [ ] y = (String []) obj;
        for ( int i = 5 , j = 0; i > 0; --i, j++ ) {
            y [j] = Integer.toString(i);
        }
    }
}
