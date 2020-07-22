package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> students;

    public Klass() {
        this.students = new ArrayList<>();
    }

    public Klass(Integer number) {
        this.students = new ArrayList<>();
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        StringBuilder strClassName = new StringBuilder();
        if(this.number == null){
            strClassName.append("No Class");
        }else{
            strClassName.append("Class ").append(this.number);
        }
        return strClassName.toString();
    }

    public void assignLeader(Student student) {
        if(this.students.contains(student)){
            this.leader = student;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        this.students.add(student);
    }
}
