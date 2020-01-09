package day04;

public class Student {
    private String name;
    private int age;
    private boolean man;//男的


    public void setName(String str){
        name=str;
    }

    public  String getName(){
        return name;
    }

    public void setAge(int num){
        age =num;
    }

    public int getAge(){
        return age;
    }

    public void setMan(boolean b){
        man=b;
    }

    public boolean isMan() {
        return man;
    }
}
