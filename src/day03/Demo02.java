package day03;

public class Demo02 {
    public static void main(String[] args) {
    Student student =new Student();
    student.age=20;
    student.name="goushi";
    student.study();

    shuchuxsheng(student);
    }

    public static void shuchuxsheng(Student student){     //当一个对象作为参数传递到方法中时传递的是对象的地址值
        System.out.println(student.age);
        System.out.println(student.name);
    }
}
