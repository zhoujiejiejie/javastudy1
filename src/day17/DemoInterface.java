package day17;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        List<String> strings = addNames(list);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("周杰");
        list.add("狗屎");
        list.add("小明");
        list.add("哈哈");

        return list;
    }
}
