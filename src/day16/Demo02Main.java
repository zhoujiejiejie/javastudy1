package day16;

public class Demo02Main {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.methodInner();
    }
}
