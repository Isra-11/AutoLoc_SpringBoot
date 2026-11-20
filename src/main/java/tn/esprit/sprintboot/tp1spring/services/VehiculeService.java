package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Equipement;
import tn.esprit.sprintboot.tp1spring.domain.Vehicule;
import tn.esprit.sprintboot.tp1spring.repositories.EquipementRepository;
import tn.esprit.sprintboot.tp1spring.repositories.VehiculeRepository;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.sprintboot.tp1spring.domain.Agence;
import tn.esprit.sprintboot.tp1spring.repositories.AgenceRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehicule{
    private final VehiculeRepository vr;
    private final AgenceRepository ar;
    private final EquipementRepository eqr;
    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vr.save(v);
    }

    @Override
    public void deleteVehicule(Long idv) {
        vr.deleteById(idv);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vr.save(v);
    }

    @Override
    public Vehicule findVehiculeById(Long idv) {
        return vr.findById(idv).orElse(null);
    }

    @Override
    public List<Vehicule> findAll() {
        return vr.findAll();
    }

    //méthode d'affectation
    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {

        Vehicule v = vr.findById(idVehicule).orElse(null);
        Agence a = ar.findById(idAgence).orElse(null);

        if (v != null && a != null) {
            v.setAgence(a);
            return vr.save(v);
        }

        return null;
    }

    //Méthode d'affectation
    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule v = vr.findById(idVehicule).orElse(null);
        Equipement e = eqr.findById(idEquipement).orElse(null);

        if (v != null && e != null) {
            v.getEquipements().add(e);
            return vr.save(v);
        }

        return null;
    }

    //Méthode de désaffectation
    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule v = vr.findById(idVehicule).orElse(null);
        Equipement e = eqr.findById(idEquipement).orElse(null);

        if (v != null && e != null) {
            v.getEquipements().remove(e);
            return vr.save(v);
        }

        return null;
    }
}
