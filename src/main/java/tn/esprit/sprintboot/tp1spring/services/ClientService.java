package tn.esprit.sprintboot.tp1spring.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprintboot.tp1spring.domain.Client;
import tn.esprit.sprintboot.tp1spring.repositories.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClient{
    private final ClientRepository cr;


    @Override
    public Client addClient(Client c) {
        return cr.save(c);
    }

    @Override
    public void deleteClient(Long idc) {
         cr.deleteById(idc);
    }

    @Override
    public Client updateClient(Client c) {
        return cr.save(c);
    }

    @Override
    public Client findClientById(Long idc) {
        return cr.findById(idc).orElse(null);
    }

    @Override
    public List<Client> findAll() {
        return cr.findAll();
    }

}
