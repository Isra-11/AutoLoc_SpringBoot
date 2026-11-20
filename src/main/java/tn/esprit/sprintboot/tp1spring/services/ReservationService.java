package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Reservation;
import tn.esprit.sprintboot.tp1spring.repositories.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements IReservation{
    private final ReservationRepository rr;

    @Override
    public Reservation addReservation(Reservation r) {
        return rr.save(r);
    }

    @Override
    public void deleteReservation(Long idr) {
        rr.deleteById(idr);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return rr.save(r);
    }

    @Override
    public Reservation findReservationById(Long idr) {
        return rr.findById(idr).orElse(null);
    }

    @Override
    public List<Reservation> findAll() {
        return rr.findAll();
    }
}
