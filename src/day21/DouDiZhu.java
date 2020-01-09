package day21;


import java.util.*;

//斗地主有序版本
public class DouDiZhu {
    public static void main(String[] args) {
        //装备牌
        HashMap<Integer,String> puke=new HashMap<>();

        ArrayList<Integer> pukeIndex =new ArrayList<>();

        List<String> color=new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        List<String> number=new ArrayList<>();
        number.add("A");
        number.add("2");
        number.add("K");
        number.add("Q");
        number.add("J");
        number.add("10");
        number.add("9");
        number.add("8");
        number.add("7");
        number.add("6");
        number.add("5");
        number.add("4");
        number.add("3");

        System.out.println(color);
        System.out.println(number);

        int index=0;
        puke.put(index,"大王");
        pukeIndex.add(index);
        index++;
        puke.put(index,"小王");
        pukeIndex.add(index);
        index++;

        for (String s:color){
            for (String n:number){
                String r=s+n;
                puke.put(index,r);
                pukeIndex.add(index);
                index++;
            }
        }

        System.out.println(puke);
        System.out.println(pukeIndex);

        //洗牌：使用Collections中的shffle洗牌
        Collections.shuffle(pukeIndex);
        System.out.println("洗完牌后的索引");
        System.out.println(pukeIndex);

        //发牌：定义四个集合来放索引，再通过索引来拿值
        ArrayList<Integer> play1=new ArrayList<>();
        ArrayList<Integer> play2=new ArrayList<>();
        ArrayList<Integer> play3=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        for (int i = 0; i < pukeIndex.size(); i++) {
            if (i>51){
                dipai.add(i);
            }else if (i%3==0){
                play1.add(i);
            }else if (i%3==1){
                play2.add(i);
            }else if (i%3==2){
                play3.add(i);
            }
        }

        //将每个玩家的牌的索引排序
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(dipai);

        System.out.println("===============================");
        //展示牌：

        System.out.print("玩家一：");
        Iterator<Integer> iterator = play1.iterator();
        while (iterator.hasNext()){
            String s = puke.get(iterator.next());
            System.out.print(s+" ");
        }


    }
}
