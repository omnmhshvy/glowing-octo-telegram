package ConstructorReference;

import java.util.List;
import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class ConstRefCl {
    List<Student> list;

    public ConstRefCl() {
        this.list = StudentDataBase.getAllStudents();
    }
    public List<Student> getList() {
        return list;
    }
}
