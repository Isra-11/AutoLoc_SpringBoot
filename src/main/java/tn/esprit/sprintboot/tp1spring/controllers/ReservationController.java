package tn.esprit.sprintboot.tp1spring.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Reservation;
import tn.esprit.sprintboot.tp1spring.services.IReservation;
import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final IReservation reservationService;

    @PostMapping("/add")
    public Reservation addReservation(
            @RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping("/find/{id}")
    public Reservation findReservation(@PathVariable Long id) {
        return reservationService.findReservationById(id);
    }

    @PutMapping("/update")
    public Reservation updateReservation(
            @RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> findAllReservations() {
        return reservationService.findAll();
    }
}
