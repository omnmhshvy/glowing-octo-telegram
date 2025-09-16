package FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOpEx {

    static UnaryOperator<String> UnaryOp = (s) -> s.concat("Default");
    public static void main(String[] args) {
        StudentDataBase.getAllStudents()
        .stream()
        .forEach(s -> 
        System.out.println(s.getName() + ": " + UnaryOp.apply(s.getName())));
    }
}
