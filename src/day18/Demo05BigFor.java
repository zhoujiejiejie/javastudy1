package day18;

import java.util.ArrayList;

public class Demo05BigFor {

    public static void main(String[] args) {
        demo01();

        demo02();
    }

    private static void demo02() {
        ArrayList<String> arry=new ArrayList<>();
        arry.add("周杰");
        arry.add("狗屎");
        arry.add("小明");

        for (String s:arry){
            System.out.println(s);
        }

    }





    private static void demo01() {
        int [] arry={1,2,3,4,5,6};
        for (int i:arry){
            System.out.println(i);
        }
    }
}
