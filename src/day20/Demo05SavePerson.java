package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo05SavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        //K:Person    V:String
        HashMap<Person,String> map02=new HashMap<>();
        map02.put(new Person("周杰",100),"云南");
        map02.put(new Person("狗屎",19),"云南");
        map02.put(new Person("小明",200),"天津");
        map02.put(new Person("周杰",100),"美国");

        //重写hashCode和equals方法所以没有会有重复
        Set<Person> people = map02.keySet();
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            System.out.println(map02.get(iterator.next()));
        }

    }




    //用HashMap来存储自定义类型的键值
    //K：String V：Person
    //因为String类型重写了hashCode和equals方法可以保证key是不重复的   所以第一个上海的“周杰”被替换了
    private static void show01() {
        Map<String,Person> map=new HashMap();

        map.put("上海",new Person("周杰",20));
        map.put("天津",new Person("狗屎",19));
        map.put("上海",new Person("小明",20));
        map.put("云南",new Person("小狗",55));

        //用keySet+增强for遍历HashMap集合
        Set<String> strings = map.keySet();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
    }
}
