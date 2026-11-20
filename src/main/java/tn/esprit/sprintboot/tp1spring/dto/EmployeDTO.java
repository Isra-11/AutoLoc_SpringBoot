package tn.esprit.sprintboot.tp1spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.sprintboot.tp1spring.domain.RoleEmploye;

@Getter
@Setter
public class EmployeDTO {

    private Long idEmploye;
    @NotBlank(message = "Le nom est obligatoire")
    @Size(min = 2, max = 50,
            message = "Le nom doit contenir entre 2 et 50 caractères")
    private String nom;

    @NotBlank(message = "Le prénom est obligatoire")
    @Size(min = 2, max = 50,
            message = "Le prénom doit contenir entre 2 et 50 caractères")
    private String prenom;

    @NotNull(message = "Le rôle est obligatoire")
    private RoleEmploye role;

    private Long idAgence;
}