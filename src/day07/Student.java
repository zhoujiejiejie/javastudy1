package day07;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idjishuqi=0;

    public Student() {
        idjishuqi++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idjishuqi;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
