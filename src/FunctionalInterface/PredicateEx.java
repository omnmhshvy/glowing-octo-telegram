package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateEx {

    static Predicate<Integer> p = (i) -> {return (i % 2 == 0);};
    static Predicate<Integer> p1 = (i) -> i % 5 == 0;

    static void predicateAnd(){
        System.out.println("10 is even : " + p.test(10));
        System.out.println("Predicate chaining - 5 Div by 2 and 5 : " + p.and(p1).test(5));
    }
    
    static void predicateOr(){
        System.out.println("Predicate chaining - 5 Div by 2 or 5 : " + p.or(p1).test(5));
        System.out.println("Predicate chaining - 8 Div by 2 or 5 : " + p.or(p1).test(8));
    }

    static void predicateNeg(){
        System.out.println("Predicate negate chaining - 5 Div by 2 or 5 : " + p.or(p1).negate().test(5));
        System.out.println("Predicate negate chaining - 8 Div by 2 or 5 : " + p.or(p1).negate().test(8));
    }
    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNeg();

    }

}
