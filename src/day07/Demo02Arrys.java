package day07;

import java.util.Arrays;

public class Demo02Arrys {
    public static void main(String[] args) {
        int [] arry={1,22,5,44,88};
        String s = Arrays.toString(arry);
        System.out.println(s);

        int[] arry1={5,69,5,8,2,3,5};
        Arrays.sort(arry1);
        System.out.println(Arrays.toString(arry1));
    }
}
