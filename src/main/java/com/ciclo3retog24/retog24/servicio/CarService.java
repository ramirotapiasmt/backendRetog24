package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Car;
import com.ciclo3retog24.retog24.repositorio.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    /**
     * Mostrar datos
     */

    public List<Car> getCars() {
        return repository.findAll();

    }

    public Car saveCar(Car car) {
        return repository.save(car);
    }

    public Car getCar(long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {
        repository.deleteById(id);
    }

    public Car updateCar(Car carUpd) {
        Car carOld = getCar(carUpd.getId_Car());
        carOld.setName(carUpd.getName());
        carOld.setDescription(carUpd.getDescription());
        return repository.save(carOld);


    }


}