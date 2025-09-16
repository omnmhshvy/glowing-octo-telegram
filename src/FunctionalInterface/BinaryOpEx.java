package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
public class BinaryOpEx {
    
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    static BinaryOperator<Integer> binaryOp = (a, b) -> a * b;
    public static void main(String[] args) {
        System.out.println("Binary Operator Result: \n" + binaryOp.apply(3, 4));
        System.out.println("Max Result: \n" + BinaryOperator.maxBy(comparator).apply(3, 4));
        System.out.println("Min Result: \n" + BinaryOperator.minBy(comparator).apply(3, 4));
    }
}
