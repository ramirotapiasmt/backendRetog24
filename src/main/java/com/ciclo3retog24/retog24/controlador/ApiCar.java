package com.ciclo3retog24.retog24.controlador;


import com.ciclo3retog24.retog24.entidad.Car;
import com.ciclo3retog24.retog24.servicio.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car/")
@CrossOrigin(origins = "*")
public class ApiCar {
    /**
     * instancia de servicio categoria operaciones CRUD
     */
    @Autowired
    private CarService service;

   @GetMapping("/all")
    public List<Car> findAllCars() {
       return service.getCars();
   }
       @GetMapping("/{id}")
       public Car getCar(@PathVariable long id){
       return service.getCar(id);
       }

   @PostMapping("/save")
    public ResponseEntity saveCar(@RequestBody Car car){
       service.saveCar(car);
       return ResponseEntity.status(201).build();
   }

   @DeleteMapping("/{id}")
    public ResponseEntity deleteCar(@PathVariable long id){
       service.deleteCar(id);
       return ResponseEntity.status(204).build();
   }

   @PutMapping("/update")
    public ResponseEntity updateCar (@RequestBody Car car){
       service.updateCar(car);
       return ResponseEntity.status(201).build();
   }
}
