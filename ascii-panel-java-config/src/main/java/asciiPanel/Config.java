package asciiPanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{
    @Bean
    public AsciiPanel asciiPanel(AsciiFont asciiFont){
        AsciiPanel panel = new AsciiPanel();
        panel.setAsciiFont(asciiFont);
        return panel;
    }
    @Bean
    public AsciiFont asciiFont(){
        return new AsciiFont("cp437_8x8.png", 8, 8);
    }
}
