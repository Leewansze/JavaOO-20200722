package practice07;

public class Klass {
    private Integer number;

    public Klass() {
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
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
}
