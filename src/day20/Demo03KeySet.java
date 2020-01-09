package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03KeySet {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap();

        map.put("周杰",20);
        map.put("狗屎",19);
        map.put("小明",28);
        map.put("小狗",55);

        //先拿到所有的K放到一个Set集合
        Set<String> strings = map.keySet();
        //1.在用迭代器来遍历K，并用map的getKey方法获取V
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+map.get(next));
        }


        //2.用增强for
        for (String s:strings){
            System.out.println(s+map.get(s));
        }
    }
}
