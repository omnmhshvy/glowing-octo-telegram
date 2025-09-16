package FunctionalInterface;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FucntionStudentEx {
    
    static Function<List<Student>, Map<String, Double>> studentFunc = (students) -> {
        
        Map<String, Double> studentMap = students.stream()
        .filter(PredicateStudentEx.p1)
        .collect(Collectors.toMap(Student::getName, Student::getGpa));
        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println("Student Map: \n " + studentFunc.apply(StudentDataBase.getAllStudents()));
    }
}
