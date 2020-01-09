package day06;

import java.util.ArrayList;

public class Demo02ArryLIst {
    public static void main(String[] args) {
        //创建了一个ArryList集合里面装的都是String类型的数据
        //备注从：jdk１．７开始，右侧尖括号可以不写内容
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println(list);

        list.add("赵丽颖");
        list.add("周杰");
        list.add("狗屎");
        list1.add(1);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0));

    }
}
