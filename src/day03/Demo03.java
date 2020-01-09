package day03;

public class Demo03 {
    public static void main(String[] args) {
        Student tow =goodStudent();
        System.out.println(tow.name);
        System.out.println(tow.age);

    }

    public static Student goodStudent(){
        Student one =new Student();
        one.name="goodStudent";
        return one;                   //当使用一个对象作为方法的返回值时其实放回的是对象的地址值

    }
}
