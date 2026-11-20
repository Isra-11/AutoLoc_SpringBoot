package tn.esprit.sprintboot.tp1spring.services;

import tn.esprit.sprintboot.tp1spring.domain.Client;

import java.util.List;

public interface IClient {

    Client addClient(Client c);

    void deleteClient(Long idc);

    Client updateClient(Client c);

    Client findClientById(Long idc);

    List<Client> findAll();
}