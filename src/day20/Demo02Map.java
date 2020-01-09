package day20;

import java.util.HashMap;
import java.util.Map;

public class Demo02Map {
    public static void main(String[] args) {

        show01();
    }


    private static void show01() {
        Map<Integer,String> map=new HashMap();
        String 周杰 = map.put(1, "周杰");
        System.out.println(周杰);

        String 狗屎 = map.put(1, "狗屎");
        System.out.println(狗屎);    //返回的是被替换的值

        map.put(3,"小明");
        map.put(4,"小狗");
        System.out.println(map);

        String remove = map.remove(1);
        System.out.println(remove);   //放回被删除的K对应的V

        System.out.println(map);


        System.out.println(map.get(1));  //没有返回null
        System.out.println(map.get(3));

        System.out.println(map.containsKey(3));  //看是否包含指定的K
        System.out.println(map.containsValue("小狗"));  //看是否包含指定的K



    }
}
