package DiagnosticTest;

public class q63Animal {
    q63Animal() {
        super();
    }
}

class Bird extends q63Animal {
    Bird(String name) {
        System.out.print(name);
    }
    Bird() {
        System.out.print("unknown");
    }
}

class Program {
    public static void main(String args [ ]) {
        new Bird("parrot");
    }
}

