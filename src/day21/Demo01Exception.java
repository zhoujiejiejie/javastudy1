package day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception 编译期异常
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");//用来格式化日期
        Date data= null;
        try {
            data = sdf.parse("1999-0909");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(data);
        System.out.println("后续代码");
    }
}
