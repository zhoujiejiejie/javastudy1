package day11;

import java.util.ArrayList;
import java.util.Random;

public class Member extends user {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }


    public void recive(ArrayList<Integer> list){
        //从多个中获取一个

        int index=new Random().nextInt(list.size());

        Integer remove = list.remove(index);

        int money= (int) super.getMoney();

        super.setMoney(money+remove);
    }
}
