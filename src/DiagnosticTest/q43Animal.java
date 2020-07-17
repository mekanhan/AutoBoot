package DiagnosticTest;


public class q43Animal { // q43

    void run() {
        System.out.print("Animal run");
    }
}

class Dog extends q43Animal {

    void sound() {
        System.out.print("Bark");
    }

    public void run() {
        System.out.print(" Dog runs");
    }
}
class Program2 {
    public static void main(String [ ] args){
        q43Animal dog =  new Dog();
//        dog.sound();
        dog.run();
    }

}
