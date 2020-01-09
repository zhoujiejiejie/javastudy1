package day06;
//对象数组
public class Demo01 {
    public static void main(String[] args) {
        Presion[] arry=new Presion[3];
//        System.out.println(arry[0]);
        Presion one=new Presion("周杰",20);
        Presion two=new Presion("狗屎",19);
        Presion three=new Presion("小明",20);

        //将one的地址传给ａｒｒｙ
        arry[0]=one;
        arry[1]=one;
        arry[2]=one;
        System.out.println(arry[0]);


        System.out.println(arry[0].getName());




    }
}
