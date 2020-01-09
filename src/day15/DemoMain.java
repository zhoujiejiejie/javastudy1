package day15;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个电脑
        Computer computer=new Computer();

        computer.powerOn();
        //准备一个鼠标，供电脑使用
        Mouse mouse=new Mouse();

        //首先向上转型：鼠标是USB
        USB usbMouse=mouse;     //多态
        //参数是usb类型，传递进去的刚好就是usb鼠标

        computer.userDevice(usbMouse);




        //创建一个键盘
        Keyboard keyboard=new Keyboard();  //不用多态
        computer.userDevice(keyboard);  //也发生的自动向上转型


        computer.powerOff();
    }
}
