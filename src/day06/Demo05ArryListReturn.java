package day06;

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArryListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Random random=new Random();
            int sui=random.nextInt(100)+1;
            arrayList.add(sui);
        }
        System.out.println(arrayList);


        ArrayList<Integer> oushu = saixuan(arrayList);
        for (int i = 0; i < oushu.size(); i++) {
            System.out.println(oushu.get(i));
        }
    }



    private static ArrayList<Integer> saixuan(ArrayList<Integer> arrayList){
        ArrayList<Integer> xiaojihe=new ArrayList<>();
        for (int i = 0; i <arrayList.size(); i++) {
            int num=arrayList.get(i);
            if (num%2==0){
                xiaojihe.add(num);
            }
        }
        return xiaojihe;
    }
}
