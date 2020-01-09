package day18;

public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型-->字符串
        int a1=100;
        String s1=a1+"";
        System.out.println(s1+200);

        String s2 = Integer.toString(13);
        System.out.println(s2+14);

        String s3 = String.valueOf(5);
        System.out.println(s3+20);

        int i1 = Integer.parseInt(s1);
        System.out.println(i1+9);

    }

}
