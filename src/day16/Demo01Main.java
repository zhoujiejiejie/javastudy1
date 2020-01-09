package day16;

public class Demo01Main {
    public static void main(String[] args) {
        Body body=new Body();
        body.method();

        System.out.println("==========================");

    Body.Heart heart=new Body().new Heart();
    heart.beat();
    }
}
