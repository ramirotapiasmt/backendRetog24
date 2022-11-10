package com.ciclo3retog24.retog24.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCar;
    private String name;
    private String brand;
    private int year_;
    private String description;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "car")
    @JoinColumn(name="gama")
    @JsonIgnoreProperties("car")
    private Gama gamas;

}
