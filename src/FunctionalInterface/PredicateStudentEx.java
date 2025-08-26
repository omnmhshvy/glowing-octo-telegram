package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentEx {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    static void filterStudentsbyGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {
            if(p1.test(s)){
                System.out.println(s.getName());
            }
        });
    }

    static void filterStudentsbyGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {
            if(p2.test(s)){
                System.out.println(s.getName());
            }
        });
    }
    
    private static void filterStudents() {
        // TODO Auto-generated method stub
        try{
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {
            if(p2.and(p1).negate().test(s)){
                System.out.println(s.getName());
            }
        });
    }
    catch(Exception e){
        throw new UnsupportedOperationException("Unimplemented method 'filterStudents'");
    }
}
    public static void main(String[] args) {
        System.out.println("Filter by Grade:");
        filterStudentsbyGradeLevel();   

        System.out.println("Filter by Gpa:");
        filterStudentsbyGpa();

        System.out.println("Filter by negate:");
        filterStudents();
    }


}
