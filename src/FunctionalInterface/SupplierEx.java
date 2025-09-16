package FunctionalInterface;

import java.util.function.Supplier;
import java.util.List;

public class SupplierEx {

    static Supplier<List<Student>> supplier = () -> StudentDataBase.getAllStudents();
    public static void main(String[] args) {
     supplier.get()
     .stream()
     .filter(s -> s.getGradeLevel() >= 3)
     .map(Student::getName)
     .forEach(System.out::println);   
    }
}
