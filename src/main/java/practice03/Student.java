package practice03;

public class Student extends Person{
    private int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    @Override
    public String introduce() {
        String introduce = "I am a Student. I am at Class " + this.Klass + ".";
        return introduce;
    }
}
