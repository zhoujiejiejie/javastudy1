package day02;

public class Demo05 {
    public static void main(String[] args) {
        int []jieguo=jisuan(1,2);
        System.out.println(jieguo[0]);
        System.out.println(jieguo[1]);

    }

    public static int[] jisuan(int a,int b){
        int sum=a+b;
        int avg=a+b/2;
        int[] arry={sum,avg};
        return arry;

    }
}
