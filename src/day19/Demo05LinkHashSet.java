package day19;

import java.util.LinkedHashSet;

public class Demo05LinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> link=new LinkedHashSet<>();
        link.add("asd");
        link.add("zhoujie");
        link.add("zhoujie");
        link.add("goushi");

        System.out.println(link);
    }
}
