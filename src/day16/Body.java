package day16;

public class Body {
    //内部类
    public class Heart{

        public void beat(){
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println("我叫"+name);
        }
    }



    public void method(){
        System.out.println("外部类的方法！！");
        Heart heart=new Heart();
        heart.beat();
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
