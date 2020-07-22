package practice06;

public class Teacher extends Person{
    private Integer Klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    @Override
    public String introduce() {
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append(super.introduce());
        if(Klass != null){
            strIntroduce.append(" I am a Teacher. I teach Class ").append(this.Klass).append(".");
        }else{
            strIntroduce.append(" I am a Teacher. I teach No Class.");
        }

        return strIntroduce.toString();
    }
}
