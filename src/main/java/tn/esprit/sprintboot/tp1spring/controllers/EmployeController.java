package tn.esprit.sprintboot.tp1spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Employe;
import tn.esprit.sprintboot.tp1spring.dto.EmployeDTO;
import tn.esprit.sprintboot.tp1spring.services.IEmploye;

import java.util.List;

@RestController
@RequestMapping("/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final IEmploye employeService;

    @PostMapping("/add")
    public EmployeDTO addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping("/find/{id}")
    public EmployeDTO findEmploye(@PathVariable Long id) {
        return employeService.findEmployeById(id);
    }

    @PutMapping("/update")
    public EmployeDTO updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @GetMapping("/all")
    public List<EmployeDTO> findAllEmployes() {
        return employeService.findAll();
    }

    @PutMapping("/desaffecter/{idEmploye}")
    public EmployeDTO desaffecterEmploye(
            @PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecter/{idEmploye}/{idAgence}")
    public EmployeDTO affecterEmploye(
            @PathVariable Long idEmploye,
            @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}