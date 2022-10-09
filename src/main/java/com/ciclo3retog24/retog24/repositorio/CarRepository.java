package com.ciclo3retog24.retog24.repositorio;

import com.ciclo3retog24.retog24.entidad.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
