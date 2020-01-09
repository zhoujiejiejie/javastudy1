package day01;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(sum());
    }


    public static int sum(){
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
