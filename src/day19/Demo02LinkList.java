package day19;

import java.util.LinkedList;

public class Demo02LinkList {
    public static void main(String[] args) {
        show01();

    }

    private static void show01() {
        LinkedList<Object> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("zhoujie");
        linked.addLast("goushi");
        System.out.println(linked);
    }
}
