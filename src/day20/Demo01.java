package day20;

public class Demo01 {
    public static void main(String[] args) {
      checkQQ_1();
    }




    public static void checkQQ_1() {
        String qq = "123A456";

        String regex = "[1-9][0-9]{4,14}";

        boolean flag = qq.matches(regex);
        if (flag) {
            System.out.println(qq + "isOK");
        } else {
            System.out.println(qq + "isONONON");
        }
    }








    public static void checkQQ(){

        String qq="12345a";

        int len=qq.length();
        if (len>=9 || len<=5){
            System.out.println("长度错误！！");
        }else {
            try {
                long l = Long.parseLong(qq);
            }catch (NumberFormatException e){
                System.out.println("出现非法字符！！");
            }
                 }

            }
        }

