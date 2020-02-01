package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("Application");


        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");


        MessageService service = (MessageService) context.getBean("service");

        service.printMessage();



    }
}
