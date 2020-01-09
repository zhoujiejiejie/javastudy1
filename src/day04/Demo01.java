package day04;

public class Demo01 {
    public static void main(String[] args) {
        Persion persion=new Persion();

        persion.name="周杰";
        persion.setAge(-20);

        persion.show();
        int age=persion.getAge();
        System.out.println(age);
    }
}
