package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(55);
        set.add(3);
        set.add(10);

        //迭代器
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }
        System.out.println("==================");

        for (Integer integer:set){
            System.out.println(integer);
        }
    }
}
