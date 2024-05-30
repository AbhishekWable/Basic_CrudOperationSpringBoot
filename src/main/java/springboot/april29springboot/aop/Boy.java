package springboot.april29springboot.aop;

import org.springframework.stereotype.Component;

@Component
public class Boy {

    public void study(){
        System.out.println("Boys study");
    }
    public void play(){
        System.out.println("Boys play");
    }
}
