package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append(super.introduce()).append(" I am a Worker. I have a job.");
        return strIntroduce.toString();
    }
}

