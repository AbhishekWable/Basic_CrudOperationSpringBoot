package springboot.april29springboot.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {
    public SimConfig(){
        System.out.println("In SimConfig constructor");
    }
    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }
    @Bean
    public Jio getJio(){
        return new Jio();
    }
}
