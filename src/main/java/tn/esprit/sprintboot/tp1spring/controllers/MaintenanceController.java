package tn.esprit.sprintboot.tp1spring.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Maintenance;
import tn.esprit.sprintboot.tp1spring.services.IMaintenance;
import java.util.List;

@RestController
@RequestMapping("/maintenances")
@RequiredArgsConstructor
public class MaintenanceController {

    private final IMaintenance maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(
            @RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/find/{id}")
    public Maintenance findMaintenance(@PathVariable Long id) {
        return maintenanceService.findMaintenanceById(id);
    }

    @PutMapping("/update")
    public Maintenance updateMaintenance(
            @RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @GetMapping("/all")
    public List<Maintenance> findAllMaintenances() {
        return maintenanceService.findAll();
    }
}
