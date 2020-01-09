package day07;

//练习题
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        String str="adafafasfasd4521387";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
