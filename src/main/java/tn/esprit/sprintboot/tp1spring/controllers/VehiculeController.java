package tn.esprit.sprintboot.tp1spring.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Vehicule;
import tn.esprit.sprintboot.tp1spring.services.IVehicule;
import java.util.List;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeController {

    private final IVehicule vehiculeService;

    @PostMapping("/add")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/find/{id}")
    public Vehicule findVehicule(@PathVariable Long id) {
        return vehiculeService.findVehiculeById(id);
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @GetMapping("/all")
    public List<Vehicule> findAllVehicules() {
        return vehiculeService.findAll();
    }

    @PutMapping("/affecter/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(
            @PathVariable Long idVehicule,
            @PathVariable Long idAgence) {

        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }

    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}
