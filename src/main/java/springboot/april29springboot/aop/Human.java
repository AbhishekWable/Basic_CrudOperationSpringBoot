package springboot.april29springboot.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Human {
    //Aspects          //execution is designation  // public void study() is a pointcut
    @Before(value = "execution( public void springboot.april29springboot.aop.Girl.study())")
    public void wakeUp(){
        System.out.println("Wake up");
    }
    @After(value = "execution(public void study*())")
    public void sleep(){
        System.out.println("sleep");
    }
}
