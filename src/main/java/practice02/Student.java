package practice02;

public class Student extends Person{
    private int Klass;
    public Student(String name, int age, int classNum) {
        super(name, age);
        this.Klass = classNum;
    }

    public int getKlass() {
        return Klass;
    }

    public String introduce(){
        String introduce = "I am a Student. I am at Class " + this.Klass + ".";
        return introduce;
    }
}
