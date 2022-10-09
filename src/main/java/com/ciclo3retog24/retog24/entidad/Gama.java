package com.ciclo3retog24.retog24.entidad;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="gamas")
public class Gama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Gama;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "gamas")
    @JsonIgnoreProperties("gamas")
    private Car car;

}

