package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Employe;
import tn.esprit.sprintboot.tp1spring.dto.EmployeDTO;

import java.util.List;

public interface IEmploye {

    EmployeDTO addEmploye(Employe e);

    void deleteEmploye(Long ide);

    EmployeDTO updateEmploye(Employe e);

    EmployeDTO findEmployeById(Long ide);

    List<EmployeDTO> findAll();

    EmployeDTO desaffecterEmploye(Long idEmploye);

    EmployeDTO affecterEmploye(Long idEmploye, Long idAgence);
}