package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Paiement;

import java.util.List;

public interface IPaiement {

    Paiement addPaiement(Paiement p);

    void deletePaiement(Long idp);

    Paiement updatePaiement(Paiement p);

    Paiement findPaiementById(Long idp);

    List<Paiement> findAll();
}