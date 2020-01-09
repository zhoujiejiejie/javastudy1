package day14;

public class Zi extends Fu {

    int num=10;

    @Override
    public void shownum() {
        System.out.println(num);
    }

    @Override
    public void mathod() {
        System.out.println("子类方法！！");
//        super.mathod();
    }


    public void methodZi(){
        System.out.println("子类特有方法！！");
    }
}
