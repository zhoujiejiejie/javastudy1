package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List  {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();


        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);

        list.add(1,"zhoujie");
        System.out.println(list);



        list.remove(0);
        System.out.println(list);

        String goushi = list.set(3, "goushi");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=========================");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next());
        }

        System.out.println("=========================");
        for (String s:list){
            System.out.println(s);
        }
    }
}
