package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = new Klass();
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append(super.introduce());
        if((this.klass.getNumber()) != null){
            strIntroduce.append(" I am a Teacher. I teach ").append(this.klass.getDisplayName()).append(".");
        }else{
            strIntroduce.append(" I am a Teacher. I teach ").append(this.klass.getDisplayName()).append(".");
        }

        return strIntroduce.toString();
    }

    public String introduceWith(Student student){
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append(super.introduce());
        if(this.klass.getNumber().equals(student.getKlass().getNumber())){
            strIntroduce.append(" I am a Teacher. I teach ").append(student.getName()).append(".");
        }else{
            strIntroduce.append(" I am a Teacher. I don't teach ").append(student.getName()).append(".");
        }
        return strIntroduce.toString();
    }
}
