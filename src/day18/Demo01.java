package day18;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        demo01();
        demo02();

    }

    private static void demo02() {
        int [] src={1,2,3,4,5};

        int [] src1={6,7,8,9,10};

        System.arraycopy(src,0,src1,0,3);

        System.out.println(Arrays.toString(src));
        for (int i = 0; i < src1.length; i++) {
            System.out.println(src1[i]);
        }

    }



    private static void demo01() {
        long start = System.currentTimeMillis();

        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);

        }
        long end = System.currentTimeMillis();

        System.out.println("耗时"+(start-end)+"毫秒");

    }
}
