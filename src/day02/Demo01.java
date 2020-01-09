package day02;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(isSame((byte) 10,(byte)20));
        System.out.println(isSame(30,30));
    }


    public static boolean isSame(byte a,byte b){
        boolean same;
        if (a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }


    public static boolean isSame(int a,int b){
        boolean same = a==b? true : false;
        return same;

    }
}
