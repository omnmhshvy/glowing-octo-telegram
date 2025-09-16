package MethodReference;

import java.util.List;
import java.util.function.Supplier;
import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class RefactorMRex {

    static Supplier<List<Student>> sup = StudentDataBase::getAllStudents;
    public static void main(String[] args) {
        sup.get().stream()
        .filter(predicatesforMR.p1)
        .map(Student::getName)
        .forEach(System.out::println);

        sup.get().stream()
        .filter(predicatesforMR.p2)
        .map(Student::getName)
        .forEach(System.out::println);
    }
}
