package day12;

public interface MyInterfaceAbstract {


    public abstract void methodAbs();

    abstract void methodAbs1();

    public void methodAbs2();

    void methodAbs3();

    public default int add(int a,int b){
        int c=a+b;
        return c;
    }

}
