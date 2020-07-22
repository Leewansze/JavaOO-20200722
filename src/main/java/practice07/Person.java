package practice07;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        StringBuilder strIntroduce = new StringBuilder();
        strIntroduce.append("My name is ").append(this.name).append(". I am ").append(this.age).append(" years old.");
        return strIntroduce.toString();
    }
}
