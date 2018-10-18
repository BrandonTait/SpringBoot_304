package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepo carRepo;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car(2019, "BMW", "5 series");
        carRepo.save(car);

        car = new Car(2017, "Nissan", "Sentra");
        carRepo.save(car);

        car = new Car(1990, "Cadillac", "Escalade");
        carRepo.save(car);
    }
}
