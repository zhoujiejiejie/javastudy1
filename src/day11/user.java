package day11;

public class user {
    private String name;
    private int money;

    public user() {
    }

    public user(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫:"+name+"我有"+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
