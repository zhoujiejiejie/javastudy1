package day05;

public class Demo02Student {
    public static void main(String[] args) {
        Student student=new Student();
        Student student１=new Student("周杰",  20);


        System.out.println("我叫"+student１.getName()+"今年"+student１.getAge()+"岁");
        //如果需要改变还可以用set方法来改变

    }
}
