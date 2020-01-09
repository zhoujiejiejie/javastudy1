package day19;

public class Demo06 {
    public static void main(String[] args) {
        add(1,2);

    }

    public static int add(int...arry){        //底层是一个数组，传多少参数讲来数组就定义多大
        System.out.println(arry[0]+arry[1]);
        return 0;
    }
}
