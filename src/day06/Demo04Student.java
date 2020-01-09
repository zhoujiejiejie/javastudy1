package day06;

import java.util.ArrayList;

public class Demo04Student {
    public static void main(String[] args) {
        Student student=new Student("周杰",20);
        Student student1=new Student("狗屎",19);
        Student student2=new Student("小白",25);
        Student student3=new Student("小明",29);


        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);


        for (int i = 0; i < arrayList.size(); i++) {
            Student stu=arrayList.get(i);
            System.out.println("名字："+stu.getName()+","+"年龄："+stu.getAge());

        }



    }
}
