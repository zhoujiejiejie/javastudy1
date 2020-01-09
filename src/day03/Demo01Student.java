package day03;

public class Demo01Student {
    public static void main(String[] args) {


        Student zhoujie = new Student();

        zhoujie.name="周杰";
        zhoujie.age=21;


        System.out.println(zhoujie.name);
        System.out.println(zhoujie.age);

        zhoujie.eat();
        zhoujie.sleep();
        zhoujie.study();


    }
}
