package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Reservation;
import com.ciclo3retog24.retog24.repositorio.ReservationRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    private List<Reservation>getReservations(){
        return repository.findAll();

            }
            public Reservation saveReservation(Reservation reservation){
            return repository.save(reservation);
            }
            public Reservation getReservation(long id){
            return repository.findById(id).orElse(null);

            }
            public Reservation updateReservation(Reservation reservationUpd){
                Reservation reservationOld = getReservation(reservationUpd.getIdReservation());
                reservationOld.getIdReservation();
                return repository.save(reservationOld);
            }


}
