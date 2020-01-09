package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo04EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();

        map.put("周杰",20);
        map.put("狗屎",19);
        map.put("小明",28);
        map.put("小狗",55);

        //用entrySet方法来吧map中的entry对象取出来装到一个set集合中
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //2.用迭代器遍历set集合
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }
    }
}
