package MethodReference;
import java.util.function.Consumer;

import FunctionalInterface.StudentDataBase;
public class ConsumerMRex {

    static Consumer<String> con = System.out::println;
    public static void main(String[] args) {
        con.accept("Hello, Method Reference Consumer Example!");
        StudentDataBase.getAllStudents().forEach(s -> con.accept(s.getName()));
    }
}
