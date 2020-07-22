package practice08;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
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

    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()){
           return  false;
        }
        Person person = (Person) obj;
        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
