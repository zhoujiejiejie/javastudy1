package day06;

import java.util.ArrayList;
import java.util.Random;

public class Demo03ArryListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Random random=new Random();
            int sui=random.nextInt(63)+1;
            arrayList.add(sui);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
