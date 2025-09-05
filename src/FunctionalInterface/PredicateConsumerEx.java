package FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerEx {
    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;  
    
    BiConsumer<String,List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);

    };
    Consumer<Student> StudentConsumer = (s) -> {
        if(biPredicate.test(s.getGradeLevel(), s.getGpa())){
            studentBiConsumer.accept(s.getName(), s.getActivities());

        }
    };

    public void printNameandActivities(List<Student> students){
        students.forEach(StudentConsumer);

    }
    public static void main(String[] args) {
        new PredicateConsumerEx().printNameandActivities(StudentDataBase.getAllStudents());
    }

}
