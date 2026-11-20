package tn.esprit.sprintboot.tp1spring.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Paiement;
import tn.esprit.sprintboot.tp1spring.services.IPaiement;
import java.util.List;

@RestController
@RequestMapping("/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final IPaiement paiementService;

    @PostMapping("/add")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @GetMapping("/find/{id}")
    public Paiement findPaiement(@PathVariable Long id) {
        return paiementService.findPaiementById(id);
    }

    @PutMapping("/update")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @GetMapping("/all")
    public List<Paiement> findAllPaiements() {
        return paiementService.findAll();
    }
}

