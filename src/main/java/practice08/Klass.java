package practice08;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass() {
    }

    public Klass(Integer number) {
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
        this.leader = student;
    }
}
