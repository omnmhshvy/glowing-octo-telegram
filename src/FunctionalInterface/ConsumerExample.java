package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer_ex = (s) -> System.out.println(s.toUpperCase());
        consumer_ex.accept("java_AND_c#");
    }
}
