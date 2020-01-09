package day16;

public class Outer {
    int num=10;  //外

    public class Inner{

        int num=20;  //内

        public void methodInner(){
            int num =30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
