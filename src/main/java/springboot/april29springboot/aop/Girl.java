package springboot.april29springboot.aop;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    public void study(){
        System.out.println("Girls study");
    }
    public void play(){
        System.out.println("Girls play");
    }
}
