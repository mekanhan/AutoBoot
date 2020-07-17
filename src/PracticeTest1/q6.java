package PracticeTest1;
import java.util.Arrays;
public class q6 {
    public static void main(String [ ] args) {

        int[ ] a1 = {2,-1,4,5,3};
        int[ ] a2 = {2,-1,4,5,3};

        System.out.print((a1 == a2) + " ");
        System.out.print(Arrays.equals(a1, a2) + " " );
        //System.out.print(Arrays.deepEquals(a1, a2) + " " );
    }
//    Explanation:
//
//    Option E is the correct answer.
//
//    Arrays class has deepEquals method which takes two object arrays.
//
//    public static boolean deepEquals(Object[] a1,Object[] a2)
//
//    It returns true if the two specified arrays are deeply equal to one another. Unlike the equals(Object[],Object[]) method, this method is appropriate for use with nested arrays of arbitrary depth.
//
//    Here at line 11, we have invoked the deepEquals method by passing two int arrays. So, it will result compile error. deepEquals method accepts the Object array references and notes the primitive array references.So, option E is correct.
//
//    Reference            :http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
}
