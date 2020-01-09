package day12;

public interface MyInterfacePrientA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommen();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommen();

    }

    public static void methodCommen(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
