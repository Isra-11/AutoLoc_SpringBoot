package tn.esprit.sprintboot.tp1spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Equipement;
import tn.esprit.sprintboot.tp1spring.services.IEquipement;
import java.util.List;

@RestController
@RequestMapping("/equipements")
@RequiredArgsConstructor
public class EquipementController {

    private final IEquipement equipementService;

    @PostMapping("/add")
    public Equipement addEquipement(
            @RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @GetMapping("/find/{id}")
    public Equipement findEquipement(@PathVariable Long id) {
        return equipementService.findEquipementById(id);
    }

    @PutMapping("/update")
    public Equipement updateEquipement(
            @RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @GetMapping("/all")
    public List<Equipement> findAllEquipements() {
        return equipementService.findAll();
    }
}
