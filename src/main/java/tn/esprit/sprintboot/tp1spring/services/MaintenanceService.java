package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Maintenance;
import tn.esprit.sprintboot.tp1spring.repositories.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements IMaintenance{
    private final MaintenanceRepository mr;

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return mr.save(m);
    }

    @Override
    public void deleteMaintenance(Long idm) {
        mr.deleteById(idm);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return mr.save(m);
    }

    @Override
    public Maintenance findMaintenanceById(Long idm) {
        return mr.findById(idm).orElse(null);
    }

    @Override
    public List<Maintenance> findAll() {
        return mr.findAll();
    }
}
