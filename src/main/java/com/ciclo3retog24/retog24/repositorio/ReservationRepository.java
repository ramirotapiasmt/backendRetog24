package com.ciclo3retog24.retog24.repositorio;

import com.ciclo3retog24.retog24.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
