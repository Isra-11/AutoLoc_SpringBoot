package tn.esprit.sprintboot.tp1spring.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Contrat;
import tn.esprit.sprintboot.tp1spring.services.IContrat;
import java.util.List;

@RestController
@RequestMapping("/contrats")
@RequiredArgsConstructor
public class ContratController {

    private final IContrat contratService;

    @PostMapping("/add")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping("/find/{id}")
    public Contrat findContrat(@PathVariable Long id) {
        return contratService.findContratById(id);
    }

    @PutMapping("/update")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @GetMapping("/all")
    public List<Contrat> findAllContrats() {
        return contratService.findAll();
    }
}
