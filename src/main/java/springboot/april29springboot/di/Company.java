package springboot.april29springboot.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Autowired
    private Employee employee;


    //constructor based Dependency Injection
//    public Company(Employee employee) {
//        this.employee = employee;
//    }


    //setter based Dependency Injection
//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public void display(){
         employee.show();
    }
}
