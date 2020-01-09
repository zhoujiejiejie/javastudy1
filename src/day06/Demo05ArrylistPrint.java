package day06;

import java.util.ArrayList;

public class Demo05ArrylistPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("周杰");
        arrayList.add("狗屎");
        arrayList.add("小明");
        arrayList.add("小狗");

        System.out.println(arrayList);



        printArriList(arrayList);

    }


    public static void printArriList(ArrayList<String> arrayList){
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i<arrayList.size()-1) {
                System.out.print(arrayList.get(i) + "@");
            }else {
                System.out.print(arrayList.get(i));
            }
        }
        System.out.println("}");
    }
}
