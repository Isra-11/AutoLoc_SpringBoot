package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Equipement;

import java.util.List;

public interface IEquipement {

    Equipement addEquipement(Equipement e);

    void deleteEquipement(Long ide);

    Equipement updateEquipement(Equipement e);

    Equipement findEquipementById(Long ide);

    List<Equipement> findAll();
}