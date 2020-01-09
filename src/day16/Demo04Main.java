package day16;




public class Demo04Main {
    public static void main(String[] args) {

        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("用匿名内部类覆盖重写抽象方法！！");
            }
        };
        obj.method();
    }
}
