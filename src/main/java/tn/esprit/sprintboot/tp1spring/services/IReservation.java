package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Reservation;

import java.util.List;

public interface IReservation {

    Reservation addReservation(Reservation r);

    void deleteReservation(Long idr);

    Reservation updateReservation(Reservation r);

    Reservation findReservationById(Long idr);

    List<Reservation> findAll();
}