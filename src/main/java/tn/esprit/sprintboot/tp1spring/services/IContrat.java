package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Contrat;
import java.util.List;

public interface IContrat {

    Contrat addContrat(Contrat c);

    void deleteContrat(Long idc);

    Contrat updateContrat(Contrat c);

    Contrat findContratById(Long idc);

    List<Contrat> findAll();
}