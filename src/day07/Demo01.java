package day07;

public class Demo01 {
    public static void main(String[] args) {
        Student student1=new Student("周杰",20);
        student1.room="软件1702";
        Student student2=new Student("狗屎",16);

        System.out.println(student1.getId()+student1.getName()+student1.getAge()+student1.room);
        System.out.println(student2.getId()+student2.getName()+student2.getAge()+student2.room);
    }

}
