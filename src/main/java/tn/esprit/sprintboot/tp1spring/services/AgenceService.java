package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Agence;
import tn.esprit.sprintboot.tp1spring.repositories.AgenceRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AgenceService implements IAgence{
    private final AgenceRepository ar;

    @Override
    public Agence addagence(Agence a) {
        return ar.save(a);
    }

    @Override
    public void delete(Long idagence) {
        ar.deleteById(idagence);
    }

    @Override
    public Agence find(Long idagence) {
        return ar.findById(idagence).orElse(null);
    }

    @Override
    public Agence update(Agence idagence) {
        return ar.save(idagence);
    }

    @Override
    public List<Agence> findAll() {
        return ar.findAll();
    }


}
