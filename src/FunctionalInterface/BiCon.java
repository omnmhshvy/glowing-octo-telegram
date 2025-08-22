package FunctionalInterface;

import java.util.function.BiConsumer;

public class BiCon {
    public static void main(String[] args) {
        BiConsumer<String, String> biCon = (a,b) -> {
            System.out.println("a : " + a);
            System.out.println("b : " + b);
        };

        biCon.accept("One", "Two");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiply : " + (a * b));
        };

                BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division : " + (a / b));
        };

        multiply.andThen(division).accept(10,5);
    }
}
