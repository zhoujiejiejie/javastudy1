package day05;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Random random=new Random();
        int sui=random.nextInt(100);
        System.out.println(sui);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int shuru = scanner.nextInt();
            if (shuru==sui){
                System.out.println("恭喜你猜对了！！");
                break;
            }else if (shuru>sui){
                System.out.println("太大了，请重试！！");
            }else {
                System.out.println("太小了，请重试！！");
            }
        }
    }

}
