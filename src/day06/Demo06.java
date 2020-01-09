package day06;

public class Demo06 {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "Hello";
        String stra= "Java";
        char[] charArry={'H','e','l','l','o'};
        String str3= new String(charArry);


        //String内容进行比较
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //不区分大小写比较
        System.out.println("java".equalsIgnoreCase(stra));


        int length = "asdasdasdasd".length();
        System.out.println(length);

        //字符串拼接
        String str4=str1.concat(stra);
        System.out.println(str4);

        System.out.println("=====================");

        //按索引查找字符
        char c = "Hellow".charAt(1);
        System.out.println(c);

        //查找字符串在本字符串中的索引位置
        System.out.println("=====================");
        String str5="asdasdholoasdasdhello";
        int llo = str5.indexOf("llo");
        System.out.println(llo);

        String str6 = str5.substring(2);
        System.out.println(str6);

        String str7 = str5.substring(2, 10);
        System.out.println(str7);

        System.out.println("=====================");
        char[] chars = str5.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);

        System.out.println("=====================");
        byte[] bytes = str5.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str8="how do you do ?";
        String u = str8.replace("o", "*");
        System.out.println(str8);
        System.out.println(u);


    }

}
