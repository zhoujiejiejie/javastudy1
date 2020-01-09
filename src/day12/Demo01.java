package day12;

public class Demo01 {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();

        impl.methodAbs();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();

        MyInterfaceAbstractImpl2 impl2=new MyInterfaceAbstractImpl2();

        impl2.methodAbs();
        impl2.methodAbs1();
        impl2.methodAbs2();


        int add = impl.add(1, 2);
        System.out.println(add);


        int add2=impl2.add(3,5);
        System.out.println(add2);
    }
}
