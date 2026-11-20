package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Equipement;
import tn.esprit.sprintboot.tp1spring.repositories.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipement{
    private final EquipementRepository eqr;

    @Override
    public Equipement addEquipement(Equipement e) {
        return eqr.save(e);
    }

    @Override
    public void deleteEquipement(Long ide) {
        eqr.deleteById(ide);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return eqr.save(e);
    }

    @Override
    public Equipement findEquipementById(Long ide) {
        return eqr.findById(ide).orElse(null);
    }

    @Override
    public List<Equipement> findAll() {
        return eqr.findAll();
    }
}
