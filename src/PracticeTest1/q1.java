package PracticeTest1;

public class q1 {
    static int i = 2;
    public static void main(String [ ] args) {
        int array[ ] = new int[i];
        array[1] = 66;
        array[2] = 67; // outboundexception

        System.out.print(array[1]);
    }
}
