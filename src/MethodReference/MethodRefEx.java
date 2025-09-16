package MethodReference;

import java.util.function.Function;

public class MethodRefEx {
    public static void printMessage() {
        System.out.println("Hello, this is a method reference example!");
    }

    static Function<String, String> toUpperCase = String::toUpperCase;
    public static void main(String[] args) {
        Thread t = new Thread(MethodRefEx::printMessage);
        t.start();

        // Using lambda expression
        Thread t2 = new Thread(() -> MethodRefEx.printMessage());
        t2.start();

        System.out.println(toUpperCase.apply("hello world"));
    }
}
