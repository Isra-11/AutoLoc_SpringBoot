package tn.esprit.sprintboot.tp1spring.services;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Agence;
import tn.esprit.sprintboot.tp1spring.domain.Employe;
import tn.esprit.sprintboot.tp1spring.dto.EmployeDTO;
import tn.esprit.sprintboot.tp1spring.repositories.AgenceRepository;
import tn.esprit.sprintboot.tp1spring.repositories.EmployeRepository;
import java.util.stream.Collectors;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmploye{
    private final EmployeRepository er;
    private final AgenceRepository ar;

    @Override
    public EmployeDTO addEmploye(EmployeDTO dto) {

        Employe e = new Employe();

        e.setNom(dto.getNom());
        e.setPrenom(dto.getPrenom());
        e.setRole(dto.getRole());

        if (dto.getIdAgence() != null) {
            Agence agence = ar.findById(dto.getIdAgence())
                    .orElseThrow(() -> new RuntimeException("Agence introuvable"));

            e.setAgence(agence);
        }

        Employe saved = er.save(e);

        return convertToDto(saved);
    }
    @Override
    public void deleteEmploye(Long ide) {
        er.deleteById(ide);
    }

    @Override
    public EmployeDTO updateEmploye(EmployeDTO dto) {

        Employe e = er.findById(dto.getIdEmploye())
                .orElseThrow(() -> new RuntimeException("Employé introuvable"));

        e.setNom(dto.getNom());
        e.setPrenom(dto.getPrenom());
        e.setRole(dto.getRole());

        if (dto.getIdAgence() != null) {
            Agence agence = ar.findById(dto.getIdAgence())
                    .orElseThrow(() -> new RuntimeException("Agence introuvable"));

            e.setAgence(agence);
        }

        return convertToDto(er.save(e));
    }

    @Override
    public EmployeDTO findEmployeById(Long ide) {

        Employe emp = er.findById(ide).orElse(null);

        if (emp == null) {
            return null;
        }

        return convertToDto(emp);
    }
    @Override
    public List<EmployeDTO> findAll() {

        return er.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
//Méthode de désaffectation
    @Override
    @Transactional
    public EmployeDTO desaffecterEmploye(Long idEmploye) {

        Employe emp = er.findById(idEmploye).orElse(null);

        if (emp != null) {
            emp.setAgence(null);
            return convertToDto(er.save(emp));
        }

        return null;
    }

    //Méthode d'affectation
    @Override
    @Transactional
    public EmployeDTO affecterEmploye(Long idEmploye, Long idAgence) {

        Employe emp = er.findById(idEmploye).orElse(null);
        Agence agence = ar.findById(idAgence).orElse(null);

        if (emp != null && agence != null) {
            emp.setAgence(agence);
            return convertToDto(er.save(emp));
        }

        return null;
    }

    private EmployeDTO convertToDto(Employe emp) {

        EmployeDTO dto = new EmployeDTO();

        dto.setIdEmploye(emp.getIdEmploye());
        dto.setNom(emp.getNom());
        dto.setPrenom(emp.getPrenom());
        dto.setRole(emp.getRole());

        if (emp.getAgence() != null) {
            dto.setIdAgence(emp.getAgence().getIdAgence());
        }

        return dto;
    }

}
