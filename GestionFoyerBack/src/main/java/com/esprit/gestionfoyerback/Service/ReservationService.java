package com.esprit.gestionfoyerback.Service;

import com.esprit.gestionfoyerback.Entity.Foyer;
import com.esprit.gestionfoyerback.Entity.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation addReservation (Reservation reservation);
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation reservation);

    Reservation retrieveReservation (long idReservation);
}
