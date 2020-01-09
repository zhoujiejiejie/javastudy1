package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo08 {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(4);
        list01.add(3);
        list01.add(2);
        list01.add(1);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArry(list01);
        printArry(list02);


    }

    public static void printArry(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
