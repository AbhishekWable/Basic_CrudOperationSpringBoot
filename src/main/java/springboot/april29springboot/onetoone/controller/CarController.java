package springboot.april29springboot.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.onetoone.entity.Car;
import springboot.april29springboot.onetoone.entity.Driver;
import springboot.april29springboot.onetoone.repository.CarRepo;
import springboot.april29springboot.onetoone.repository.DriverRepo;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private DriverRepo driverRepo;
    @PostMapping("saveCar")
    public String saveCar(@RequestBody Car car){
        Driver driver=new Driver();
        driver.setName(car.getDriver().getName());
        driver.setAge(car.getDriver().getAge());
        driverRepo.save(driver);

        Car car1=new Car();
        car1.setDriver(driver);
        car1.setCarName(car.getCarName());
        car1.setCarNo(car.getCarNo());
        carRepo.save(car1);
        return "Car saved Successfully!!!";

    }
    @GetMapping("getCarByName/{carName}")
    public Car getCarByCar_name(@PathVariable String carName){
        return carRepo.getCarByCarName(carName);

    }

}
