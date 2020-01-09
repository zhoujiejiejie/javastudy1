package day20;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo07HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();

        map.put("s",null);
        map.put(null,"c");
        map.put(null,null);
        System.out.println(map);

        //不允许存null
        Hashtable<String,String> table=new Hashtable<>();
        table.put("s",null);
        table.put(null,"c");
        table.put(null,null);
        System.out.println(table);
    }
}
