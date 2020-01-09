package day04;

public class Persion {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫"+name+"今年"+age+"岁");
    }

    public void setAge(int num) {
        if (num>0 && num<100){
            age=num;
        }else {
            System.out.println("数据错误！！");
        }
    }

    public int getAge() {
        return age;
    }
}
