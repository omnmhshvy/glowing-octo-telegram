package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BiFunctionEx {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, pred) -> {
        return students.stream()
                .filter(pred)
                .collect(Collectors.toMap(Student::getName, Student::getGpa));
    };
    public static void main(String[] args) {
        System.out.println("BiFunction Result: \n" + biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentEx.p1));    
    }

}
