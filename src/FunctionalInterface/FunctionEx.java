package FunctionalInterface;

import java.util.function.Function;

public class FunctionEx {
    static Function<String, String> func = (name) -> name.toUpperCase();
    static Function<String, String> cCat = (name) -> name.toUpperCase().concat("Default");
    public static void main(String[] args) {
        System.out.println("Andthen Result is " + func.andThen(cCat).apply("abcd"));
        System.out.println("Compose Result is " + func.compose(cCat).apply("abcd"));
    }
}
