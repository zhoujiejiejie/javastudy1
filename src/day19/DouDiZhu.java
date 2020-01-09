package day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*  1.准备牌
  2.洗牌
  3.发牌
  4.看牌*/
public class DouDiZhu {
    public static void main(String[] args) {

        ArrayList<String> puker=new ArrayList<>();

        String[] colors={"♠","♥","♣","♦"};

        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K",};

        //大王小王存里面
        puker.add("大王");
        puker.add("小王");

        for (String number:numbers){
            for (String color:colors){
                puker.add(number+color);
            }
        }

        //2.洗牌     shuffle为Collection的静态方法打乱集合中的元素
        Collections.shuffle(puker);


        //3.发牌
        ArrayList<String> number1=new ArrayList<>();
        ArrayList<String> number2=new ArrayList<>();
        ArrayList<String> number3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for (int i = 0; i <puker.size() ; i++) {
            String p = puker.get(i);
            if (i>=51){
               dipai.add(p);
            }else if (i%3==0){
                number1.add(p);

            }else if (i%3==1){
                number2.add(p);
            }else {
                number3.add(p);
            }
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println("底牌"+dipai);

    }

}
