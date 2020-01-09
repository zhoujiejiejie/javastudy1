package day20;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo06LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();

        map.put("s","s");
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        System.out.println(map);  //无序

        LinkedHashMap<String,String> map01 =new LinkedHashMap<>();
        map01.put("s","s");
        map01.put("a","a");
        map01.put("c","c");
        map01.put("b","b");
        System.out.println(map01);
    }
}
