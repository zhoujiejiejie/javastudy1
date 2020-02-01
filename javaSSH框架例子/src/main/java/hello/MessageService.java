package hello;


/*
* 打印机
* */
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService");
    }

    //与MessageService类关联
    private MessagePrient service;


    //设置srvice的值
    public void setService(MessagePrient service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMassage());

    }
}
