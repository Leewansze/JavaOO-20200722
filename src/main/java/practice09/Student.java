package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
        this.klass = new Klass();
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String introduce;
        if(this.equals(this.klass.getLeader())){
            introduce = super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName()+ ".";
        }else{
            introduce = super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName()+ ".";
        }
        return introduce;
    }
}
