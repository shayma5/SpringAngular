package com.esprit.gestionfoyerback.Service;

import com.esprit.gestionfoyerback.Entity.Reservation;
import com.esprit.gestionfoyerback.Repository.ReservationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationImp implements ReservationService {
    private final ReservationRepo reservationRepo;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }
}
