package day03;

public class Demo01Student2 {
    public static void main(String[] args) {
        Student zhoujie = new Student();

        zhoujie.name="周杰";
        zhoujie.age=21;

        System.out.println(zhoujie.name);
        System.out.println(zhoujie.age);

        zhoujie.eat();
        zhoujie.sleep();
        zhoujie.study();



        Student zhoujie2 = new Student();

        zhoujie2.name="周杰2";
        zhoujie2.age=31;


        System.out.println(zhoujie2.name);
        System.out.println(zhoujie2.age);

        zhoujie2.eat();
        zhoujie2.sleep();
        zhoujie2.study();


    }
}
