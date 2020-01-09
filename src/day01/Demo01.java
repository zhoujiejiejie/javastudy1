package day01;

public class Demo01 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                a+=i;
            }
        }
        System.out.println(a);
    }

}
