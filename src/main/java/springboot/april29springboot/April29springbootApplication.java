package springboot.april29springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.di.Company;
import springboot.april29springboot.di.Employee;
import springboot.april29springboot.ioc.Jio;
import springboot.april29springboot.ioc.Vodafone;


@SpringBootApplication
public class April29springbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(April29springbootApplication.class, args);
//		Vodafone vodafone=context.getBean(Vodafone.class);
//		vodafone.calling();
//		vodafone.msg();
//
//		Jio jio=context.getBean(Jio.class);
//		jio.calling();
//		jio.msg();
//
//		Company company=context.getBean(Company.class);
//		company.display();
	}
//	@PostMapping("save")
//	public String printHello(){
//		return "Hello Spring!!!";
//	}

}