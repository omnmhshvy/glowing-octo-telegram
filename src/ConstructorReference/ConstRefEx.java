package ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
import FunctionalInterface.Student;
import MethodReference.predicatesforMR;

public class ConstRefEx {

    static Supplier<ConstRefCl> supplier = ConstRefCl::new;
    static Function<ConstRefCl, List<Student>> func = ConstRefCl::getList;
    public static void main(String[] args) {
        func.apply(supplier.get())
        .stream()
        .filter(predicatesforMR.p1)
        .map(Student::getName)
        .forEach(System.out::println);

        func.apply(supplier.get())
        .stream()
        .filter(predicatesforMR.p2)
        .map(Student::getName)
        .forEach(System.out::println);
    }

}
