package day11;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Hoster hoste=new Hoster("zhoujie",100);

        Member member1=new Member("狗屎1",0);
        Member member2=new Member("狗屎2",2);
        Member member3=new Member("狗屎3",4);


        hoste.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("==============");

        //群主发，返回一个集合
        ArrayList<Integer> send = hoste.send(20, 3);

        //成员收
        member1.recive(send);
        member2.recive(send);
        member3.recive(send);

        hoste.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
