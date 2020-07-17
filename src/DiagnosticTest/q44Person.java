package DiagnosticTest;

public class q44Person { //q44

    q44Person() {
        System.out.print("CP ");
    }
    static{ System.out.print("SP ");}
}
class Manager extends q44Person {
    Manager(){
        System.out.print("CT ");
    }
    {System.out.print("IT ");}
}
class Program1 {
    public static void main(String [ ] args) {
        q44Person p1 = new Manager();
    }

}
