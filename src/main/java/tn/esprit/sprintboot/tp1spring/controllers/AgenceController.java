package tn.esprit.sprintboot.tp1spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.sprintboot.tp1spring.domain.Agence;
import tn.esprit.sprintboot.tp1spring.services.IAgence;

import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final IAgence agenceService;

    // Ajouter une agence
    @PostMapping("/add")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addagence(agence);
    }

    // Supprimer une agence
    @DeleteMapping("/delete/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.delete(id);
    }

    // Rechercher une agence par ID
    @GetMapping("/find/{id}")
    public Agence findAgence(@PathVariable Long id) {
        return agenceService.find(id);
    }

    // Modifier une agence
    @PutMapping("/update")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.update(agence);
    }

    // Afficher toutes les agences
    @GetMapping("/all")
    public List<Agence> findAllAgences() {
        return agenceService.findAll();
    }
}