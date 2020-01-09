package day05;
//导包
import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {
        //System.in 代表从键盘输入
        Scanner scanner=new Scanner(System.in);
        //获取int数字
        int num =scanner.nextInt();


        int num1 =scanner.nextInt();
        System.out.println("输入的数字和等于"+(num+num1));
    }
}
