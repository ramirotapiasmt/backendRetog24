package com.ciclo3retog24.retog24.controlador;

import com.ciclo3retog24.retog24.repositorio.ReservationRepository;
import com.ciclo3retog24.retog24.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations/")
@CrossOrigin(origins = "*")
public class ApiReservation {

    @Autowired
    private ReservationService service;
}
