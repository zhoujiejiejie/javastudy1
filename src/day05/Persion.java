package day05;

public class Persion {
    String name;


    //who是对方的名字
    //里面的名字是自己的
    public void sayHello(String name){
        System.out.println(name+"你好，我是"+this.name);  //persion调用的所以其实就是ｐｒｅｓｉｏｎ.name
    }
}
