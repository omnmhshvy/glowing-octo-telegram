package MethodReference;

import java.util.function.Predicate;
import FunctionalInterface.Student;

public class predicatesforMR {
    public static Predicate<Student> p1 = (s) -> s.getGpa()>=3.9;
    public static Predicate<Student> p2 = (s) -> s.getGradeLevel()>=3;
}
