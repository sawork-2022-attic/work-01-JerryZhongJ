package asciiPanel;

import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    }
}
