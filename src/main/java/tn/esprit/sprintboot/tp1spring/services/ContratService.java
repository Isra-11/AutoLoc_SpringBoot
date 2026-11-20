package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Contrat;
import tn.esprit.sprintboot.tp1spring.repositories.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements IContrat{
    private final ContratRepository ctr;
    @Override
    public Contrat addContrat(Contrat c) {
        return ctr.save(c);
    }

    @Override
    public void deleteContrat(Long idc) {
        ctr.deleteById(idc);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return ctr.save(c);
    }

    @Override
    public Contrat findContratById(Long idc) {
        return ctr.findById(idc).orElse(null);
    }

    @Override
    public List<Contrat> findAll() {
        return ctr.findAll();
    }
}
