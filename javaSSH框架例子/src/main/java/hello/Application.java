package hello;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application");

        MessageService service=new MessageService();

        MessagePrient prient=new MessagePrient();

        service.setService(prient);

        service.printMessage();
    }
}
