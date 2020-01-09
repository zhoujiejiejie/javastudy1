package day11;

import java.util.ArrayList;

public class Hoster extends user {

    public Hoster(){

    }

    public Hoster(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int                                                              count){
        ArrayList<Integer>  redList= new ArrayList<>();

       int leftMoney = (int) super.getMoney();
       if (totalmoney>leftMoney){
           System.out.println("余额不足");
           return redList;
       }

       //扣钱
       super.setMoney(leftMoney-totalmoney);


       int avg=totalmoney/count;
       int yushu=totalmoney%count;


        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        int last=avg+yushu;

        redList.add(last);

        return redList;
    }
}
