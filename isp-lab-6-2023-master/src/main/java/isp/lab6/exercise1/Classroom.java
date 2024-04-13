package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> studentList;

    public Classroom() {
        this.studentList=new ArrayList<>(10);
    }

    public void addStudent(Student s){
        studentList.add(s);
    }

    public List<Student> getStudentList(){
        return studentList;
    }
}
