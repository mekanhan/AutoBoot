package Exceptions;

public class Stack {
    public static void main(String[] args) {
        doStuff();
    }

     static void doStuff() {
        doMoreStuff();
    }
    static void doMoreStuff () {
        System.out.println("hello");
    }
}
