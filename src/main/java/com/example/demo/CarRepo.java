package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Long> {
}
