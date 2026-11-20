package tn.esprit.sprintboot.tp1spring.dto;

import lombok.Getter;
import lombok.Setter;
import tn.esprit.sprintboot.tp1spring.domain.RoleEmploye;

@Getter
@Setter
public class EmployeDTO {

    private Long idEmploye;
    private String nom;
    private String prenom;
    private RoleEmploye role;
    private Long idAgence;
}