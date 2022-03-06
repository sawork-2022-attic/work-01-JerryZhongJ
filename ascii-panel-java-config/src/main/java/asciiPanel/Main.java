package asciiPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String []args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AsciiPanel panel = (AsciiPanel) context.getBean("asciiPanel");
        AsciiFont font = panel.getAsciiFont();
        System.out.printf("%s, %d, %d\n", font.getFontFilename(), font.getWidth(), font.getHeight());
    }
}
