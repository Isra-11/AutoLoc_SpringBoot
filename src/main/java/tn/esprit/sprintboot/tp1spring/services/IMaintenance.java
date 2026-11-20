package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Maintenance;

import java.util.List;

public interface IMaintenance {

    Maintenance addMaintenance(Maintenance m);

    void deleteMaintenance(Long idm);

    Maintenance updateMaintenance(Maintenance m);

    Maintenance findMaintenanceById(Long idm);

    List<Maintenance> findAll();
}