package day16;

public class Outer2 {
    public void methodOuter(){
        class Inner{
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }

        Inner inner=new Inner();
        inner.methodInner();
    }
}