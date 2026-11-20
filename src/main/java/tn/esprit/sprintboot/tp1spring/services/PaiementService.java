package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Paiement;
import tn.esprit.sprintboot.tp1spring.repositories.ContratRepository;
import tn.esprit.sprintboot.tp1spring.repositories.PaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements IPaiement{
    private final PaiementRepository pr;
    private final ContratRepository contratRepository;

    @Override
    public Paiement addPaiement(Paiement p) {

        return pr.save(p);
    }

    @Override
    public void deletePaiement(Long idp) {
        pr.deleteById(idp);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return pr.save(p);
    }

    @Override
    public Paiement findPaiementById(Long idp) {
        return pr.findById(idp).orElse(null);
    }

    @Override
    public List<Paiement> findAll() {
        return pr.findAll();
    }
}
