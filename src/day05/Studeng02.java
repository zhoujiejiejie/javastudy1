package day05;

public class Studeng02 {
    private String name;
    private int age;

    public Studeng02() {
    } //无参数的构造方法

    public Studeng02(String name, int age) {
        this.name = name;
        this.age = age;
    }//全参数的构造方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
