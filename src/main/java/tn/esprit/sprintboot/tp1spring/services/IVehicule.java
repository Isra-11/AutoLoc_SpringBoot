package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Vehicule;

import java.util.List;

public interface IVehicule {

    Vehicule addVehicule(Vehicule v);

    void deleteVehicule(Long idv);

    Vehicule updateVehicule(Vehicule v);

    Vehicule findVehiculeById(Long idv);

    List<Vehicule> findAll();

    Vehicule affecterVehicule(Long idVehicule, Long idAgence);

    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);

    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}