package com.esprit.gestionfoyerback.Repository;

import com.esprit.gestionfoyerback.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepo extends CrudRepository<Reservation, Long> {
}
