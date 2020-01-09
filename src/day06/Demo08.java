package day06;

public class Demo08 {
    public static void main(String[] args) {
        int[] arry={1,2,3};

        String pinjie = pinjie(arry);
        System.out.println(pinjie);
    }



    public static String pinjie(int[] arry){
     String str="[";
        for (int i = 0; i < arry.length; i++) {
            if (i==arry.length-1){
                str += "word"+arry[i]+"]";
            }else {
            str += "word"+arry[i]+"#";
            }
        }
        return str;
    }
}
