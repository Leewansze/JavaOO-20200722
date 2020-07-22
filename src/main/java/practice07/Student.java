package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append(super.introduce()).append(" I am a Student. I am at ").append(this.klass.getDisplayName()).append(".");
        return strIntroduce.toString();
    }
}
