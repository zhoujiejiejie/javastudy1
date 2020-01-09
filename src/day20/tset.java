package day20;

import java.util.*;

/*
* 统计输入的字符串中的每个字符出现的次数*/
public class tset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();

        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:i.toCharArray()){
            if (map.containsKey(c)){
                Integer integer = map.get(c);
                int sum=integer+1;
                map.put(c,sum);

            }else {
                map.put(c,1);
            }
        }

        //遍历map集合
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
