package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String shuru = scanner.next();
        System.out.println(shuru);

        char[] chars = shuru.toCharArray();
        System.out.println(chars[0]);


        ArrayList<Integer> Daxie=new ArrayList<>();
        ArrayList<Integer> Xiaoxie =new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A' && chars[i]<='z'){
                Daxie.add((int) chars[i]);

            }
            else if (chars[i]>='a'&&chars[i]<='z'){
                Xiaoxie.add((int) chars[i]);
            }
        }

        System.out.println("输入的大写字母有：");
        for (int i = 0; i < Daxie.size(); i++) {
            System.out.print(Daxie.get(i)+",");
        }
        System.out.println("===================");
        System.out.println("输入的小写字母有：");
        for (int i = 0; i < Xiaoxie.size(); i++) {
            System.out.print(Xiaoxie.get(i)+",");
        }
    }
}
