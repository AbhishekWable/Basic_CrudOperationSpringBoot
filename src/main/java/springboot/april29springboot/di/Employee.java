package springboot.april29springboot.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Long id;
    private String name;
    public void show(){
        System.out.println("In method show");
    }
}
