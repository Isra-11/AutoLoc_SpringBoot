package tn.esprit.sprintboot.tp1spring.services;


import tn.esprit.sprintboot.tp1spring.domain.Agence;

import java.util.List;

public interface IAgence {

    Agence addagence (Agence a);
    void delete (Long idagence);
    Agence find (Long idagence);
    Agence update (Agence idagence);
    List <Agence> findAll ();
}
