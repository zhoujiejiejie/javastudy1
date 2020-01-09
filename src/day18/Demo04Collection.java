package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04Collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();

        coll.add("周杰");
        coll.add("狗屎");
        coll.add("小明");
        coll.add("小猫");

        System.out.println(coll);

        boolean 小猫 = coll.remove("小猫");
        System.out.println(小猫);
        System.out.println(coll);

        boolean 周杰 = coll.contains("周杰");
        System.out.println(周杰);

        boolean empty = coll.isEmpty();
        System.out.println(empty);

        int size = coll.size();
        System.out.println(size);

        //迭代器使用
        //1.使用集合中的方法iterator（）；获取迭代器的实现类对象使用Interator接口接收（多态）
        //**迭代器也是有泛型的，迭代器的泛型跟着集合走
        Iterator<String> iterator = coll.iterator();
        boolean b = iterator.hasNext();

//        System.out.println(b);//
//        System.out.println(iterator.next());

        //取出
        while (iterator.hasNext()==true){
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
